package org.pushingpixels.demo.flamingo.common;

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import java.awt.*;
import java.util.List;
import java.util.*;

public class TestCommandButtonsSizing extends JPanel {
    private interface Creator {
        JComponent create(int fontSize);
    }

    private static class Mapping {
        private String caption;

        private Creator creator;

        private Mapping(String caption, Creator creator) {
            super();
            this.caption = caption;
            this.creator = creator;
        }
    }

    private List<Mapping> model;

    private JScrollPane central;

    private TestCommandButtonsSizing() {
        this.model = new LinkedList<>();

        for (final CommandButtonPresentationState state : new CommandButtonPresentationState[] {
                CommandButtonPresentationState.BIG, CommandButtonPresentationState.MEDIUM,
                CommandButtonPresentationState.TILE, CommandButtonPresentationState.SMALL }) {
            for (final CommandButtonKind commandButtonKind : CommandButtonKind.values()) {
                this.model.add(new Mapping(
                        state.getDisplayName() + " + " + commandButtonKind.name(), (int fontSize) ->
                        createActionOnlyButton("Sample", state, commandButtonKind,
                                fontSize)));
            }
        }

        final JList list = new JList(new AbstractListModel() {
            public Object getElementAt(int index) {
                return model.get(index);
            }

            public int getSize() {
                return model.size();
            }
        });
        list.setCellRenderer(new SubstanceDefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                return super.getListCellRendererComponent(list, ((Mapping) value).caption, index,
                        isSelected, cellHasFocus);
            }
        });
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(list), BorderLayout.WEST);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.getSelectionModel().addListSelectionListener(
                (ListSelectionEvent e) -> SwingUtilities.invokeLater(() -> {
                    if (central != null)
                        remove(central);
                    central = null;

                    int selIndex = list.getSelectedIndex();
                    if (selIndex >= 0) {
                        Mapping sel = (Mapping) list.getSelectedValue();

                        String rowSpec = "p";
                        for (int fontSize = 12; fontSize < 25; fontSize++) {
                            rowSpec += ", $lg, p";
                        }
                        FormBuilder builder = FormBuilder.create().
                                columns("right:pref, 4dlu, left:pref:grow").
                                rows(rowSpec).
                                padding(Paddings.DIALOG);
                        for (int fontSize = 11; fontSize < 25; fontSize++) {
                            int row = (fontSize - 11) * 2 + 1;
                            builder.add(fontSize + " pixels").xy(1, row);
                            builder.add(sel.creator.create(fontSize)).xy(3, row);
                        }
                        central = new JScrollPane(builder.build(),
                                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                        add(central, BorderLayout.CENTER);
                        doLayout();
                        revalidate();
                    }
                }));
    }

    private AbstractCommandButton createActionOnlyButton(String text,
            CommandButtonPresentationState state,
            CommandButtonKind commandButtonKind, int fontSize) {

        Command.Builder commandBuilder = Command.builder()
                .setText(text)
                .setExtraText("Extra for " + text.toLowerCase())
                .setIconFactory(Edit_paste.factory());
        switch (commandButtonKind) {
            case ACTION_ONLY:
                commandBuilder.setAction((CommandActionEvent e)
                        -> System.out.println("Action invoked"));
                break;
            case ACTION_AND_POPUP_MAIN_ACTION:
                commandBuilder
                        .setAction((CommandActionEvent e) -> System.out.println("Action invoked"))
                        .setSecondaryContentModel(SamplePopupMenu.getSamplePopupMenuContentModel());
                break;
            case ACTION_AND_POPUP_MAIN_POPUP:
                commandBuilder
                        .setAction((CommandActionEvent e) -> System.out.println("Action invoked"))
                        .setSecondaryContentModel(SamplePopupMenu.getSamplePopupMenuContentModel());
                break;
            case POPUP_ONLY:
                commandBuilder.setSecondaryContentModel(
                        SamplePopupMenu.getSamplePopupMenuContentModel());
                break;
        }

        CommandButtonPresentationModel.Builder commandButtonPresentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setFlat(false);
        switch (commandButtonKind) {
            case ACTION_AND_POPUP_MAIN_ACTION:
                commandButtonPresentationBuilder.setTextClickAction();
                break;
            case ACTION_AND_POPUP_MAIN_POPUP:
                commandButtonPresentationBuilder.setTextClickPopup();
                break;
        }

        CommandButtonProjection<Command> commandProjection = commandBuilder.build().project(
                commandButtonPresentationBuilder.build());
        commandProjection.setComponentCustomizer((AbstractCommandButton button) ->
                button.setFont(button.getFont().deriveFont((float) fontSize)));

        return commandProjection.buildComponent();
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            JFrame frame = new JFrame("Testing command button fonts");
            frame.setSize(800, 600);
            frame.setIconImage(RadianceLogo.getLogoImage(
                    SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                            SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                            SubstanceSlices.ColorSchemeAssociationKind.FILL,
                            ComponentState.ENABLED)));

            frame.add(new TestCommandButtonsSizing());
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }

}
