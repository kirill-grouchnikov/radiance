/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.radiance.tools.svgtranscoder.api;

/**
 * Language renderer that generates language-specific code constructs for the SVG transcoder.
 * <p>
 * Implementations of this interface produce code snippets in a specific programming language
 * (e.g., Java, Kotlin) that the transcoder uses to build the output source file.
 *
 * @author Kirill Grouchnikov.
 */
public interface LanguageRenderer {
    /**
     * Represents a method argument with a name and a type.
     */
    public class MethodArgument {
        /** Name of the argument. */
        public String name;
        /** Type of the argument. */
        public String type;

        /**
         * Creates a new method argument.
         *
         * @param name Name of the argument.
         * @param type Type of the argument.
         */
        public MethodArgument(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }

    /**
     * Returns the statement terminator for the target language (e.g., ";" for Java).
     *
     * @return The statement terminator string.
     */
    String getStatementEnd();

    /**
     * Returns the code to create a new object of the specified class, without parentheses.
     *
     * @param className Name of the class to instantiate.
     * @return The object creation expression prefix.
     */
    String getObjectCreation(String className);

    /**
     * Returns the code to create a new object of the specified class with no parameters.
     *
     * @param className Name of the class to instantiate.
     * @return The complete object creation expression.
     */
    String getObjectCreationNoParams(String className);

    /**
     * Returns the code to cast an object to the specified type.
     *
     * @param objectName    Name of the object to cast.
     * @param classToCastTo Name of the target type.
     * @return The cast expression.
     */
    String getObjectCast(String objectName, String classToCastTo);

    /**
     * Returns the code to assert that an object is non-null.
     *
     * @param objectName Name of the object.
     * @return The non-null assertion expression.
     */
    String getObjectNoNull(String objectName);

    /**
     * Returns the code for a nullable invocation: if the object is non-null, invoke the method;
     * otherwise, return the default parameter.
     *
     * @param objectName    Name of the object that may be null.
     * @param functionName  Name of the method to invoke.
     * @param parameter     The default parameter to return if the object is null.
     * @return The nullable invocation expression.
     */
    String getNullableInvocation(String objectName, String functionName, String parameter);

    /**
     * Returns the code to start a primitive array literal.
     *
     * @param primitiveTypeName Name of the primitive type.
     * @return The opening part of the array literal.
     */
    String startPrimitiveArrayOf(String primitiveTypeName);

    /**
     * Returns the code to start a generic (object) array literal.
     *
     * @param className Name of the element class.
     * @return The opening part of the array literal.
     */
    String startGenericArrayOf(String className);

    /**
     * Returns the code to close an array literal.
     *
     * @return The closing part of the array literal.
     */
    String endArray();

    /**
     * Returns the code to start a variable definition with the specified type.
     *
     * @param variableTypeName Name of the variable type.
     * @return The variable declaration prefix.
     */
    String startVariableDefinition(String variableTypeName);

    /**
     * Returns the code to start a setter method call for the specified property.
     *
     * @param propertyName Name of the property.
     * @return The setter call prefix.
     */
    String startSetterAssignment(String propertyName);

    /**
     * Returns the code to end a setter method call.
     *
     * @return The setter call suffix.
     */
    String endSetterAssignment();

    /**
     * Returns the code to invoke a getter for the specified property.
     *
     * @param propertyName Name of the property.
     * @return The getter invocation expression.
     */
    String getGetter(String propertyName);

    /**
     * Returns the code to start a method definition.
     *
     * @param methodName Name of the method.
     * @param arguments  The method arguments.
     * @return The method declaration and opening brace.
     */
    String startMethod(String methodName, MethodArgument... arguments);

    /**
     * Returns the code to end a method definition.
     *
     * @return The closing brace for the method.
     */
    String endMethod();

    /**
     * Returns the primitive type name for the given class in the target language.
     *
     * @param clazz The class whose primitive type name is requested.
     * @return The primitive type name string.
     * @throws UnsupportedOperationException if the class is not a supported primitive type.
     */
    String getPrimitiveTypeFor(Class<?> clazz);
}
