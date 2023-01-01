/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.animation.api;

import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.interpolator.PropertyInterpolator;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;

public class TimelinePropertyBuilder<T> {

    /**
     * Defines how to set a property.
     */
    @FunctionalInterface
    public interface PropertySetter<T> {
        void set(Object obj, String fieldName, T value);
    }

    /**
     * Defines how to get a property.
     */
    @FunctionalInterface
    public interface PropertyGetter<T> {
        T get(Object obj, String fieldName);
    }

    /**
     * Defines how to access a property.
     */
    public interface PropertyAccessor<T> extends PropertyGetter<T>, PropertySetter<T> {
    }

    /**
     * Default property setter.
     */
    public static class DefaultPropertySetter<T> implements PropertySetter<T> {
        private Method setterMethod;

        public DefaultPropertySetter(Object obj, String fieldName) {
            setterMethod = getSetter(obj, fieldName);
        }

        public void set(Object obj, String fieldName, T value) {
            try {
                setterMethod.invoke(obj, value);
            } catch (Throwable t) {
                throw new RuntimeException(
                        "Unable to set the value of the field '" + fieldName + "'", t);
            }
        }
    }

    /**
     * Default property getter.
     */
    public static class DefaultPropertyGetter<T> implements PropertyGetter<T> {
        private Method getterMethod;

        public DefaultPropertyGetter(Object obj, String fieldName) {
            getterMethod = getGetter(obj, fieldName);
        }

        @SuppressWarnings("unchecked")
        public T get(Object obj, String fieldName) {
            try {
                return (T) getterMethod.invoke(obj);
            } catch (Throwable t) {
                throw new RuntimeException(
                        "Unable to get the value of the field '" + fieldName + "'", t);
            }
        }
    }

    private Object target; // may be null
    private final String propertyName; // required
    private T from; // optional
    private Supplier<T> fromSupplier;
    private boolean isFromCurrent;
    private T to; // must be optional because of KeyFrames
    private Supplier<T> toSupplier;
    private PropertyInterpolator<T> interpolator; // optional
    private PropertyGetter<T> getter; // optional
    private PropertySetter<T> setter; // optional
    private KeyFrames<? extends T> keyFrames; // optional

    TimelinePropertyBuilder(String propertyName) {
        this.propertyName = propertyName;
        this.isFromCurrent = false;
    }

    public TimelinePropertyBuilder<T> from(T startValue) {
        if (this.from != null) {
            throw new IllegalArgumentException("from() can only be called once");
        }
        if (this.isFromCurrent) {
            throw new IllegalArgumentException("from() cannot be called after fromCurrent()");
        }
        if (this.fromSupplier != null) {
            throw new IllegalArgumentException("from() cannot be called after fromSupplier()");
        }
        if (this.keyFrames != null) {
            throw new IllegalArgumentException("from() cannot be called after goingThrough()");
        }
        this.from = startValue;
        return this;
    }

    public TimelinePropertyBuilder<T> fromSupplier(Supplier<T> supplier) {
        if (this.fromSupplier != null) {
            throw new IllegalArgumentException("fromSupplier() can only be called once");
        }
        if (this.isFromCurrent) {
            throw new IllegalArgumentException("fromSupplier() cannot be called after fromCurrent()");
        }
        if (this.from != null) {
            throw new IllegalArgumentException("fromSupplier() cannot be called after from()");
        }
        if (this.keyFrames != null) {
            throw new IllegalArgumentException("fromSupplier() cannot be called after goingThrough()");
        }
        this.fromSupplier = supplier;
        return this;
    }

    public TimelinePropertyBuilder<T> fromCurrent() {
        if (this.isFromCurrent) {
            throw new IllegalArgumentException("fromCurrent() can only be called once");
        }
        if (this.from != null) {
            throw new IllegalArgumentException("fromCurrent() cannot be called after from()");
        }
        if (this.fromSupplier != null) {
            throw new IllegalArgumentException("fromCurrent() cannot be called after fromSupplier()");
        }
        if (this.keyFrames != null) {
            throw new IllegalArgumentException(
                    "fromCurrent() cannot be called after goingThrough()");
        }
        this.isFromCurrent = true;
        return this;
    }

    public TimelinePropertyBuilder<T> to(T endValue) {
        if (this.to != null) {
            throw new IllegalArgumentException("to() can only be called once");
        }
        if (this.toSupplier != null) {
            throw new IllegalArgumentException("to() cannot be called after toSupplier()");
        }
        if (this.keyFrames != null) {
            throw new IllegalArgumentException("to() cannot be called after goingThrough()");
        }
        this.to = endValue;
        return this;
    }

    public TimelinePropertyBuilder<T> toSupplier(Supplier<T> supplier) {
        if (this.toSupplier != null) {
            throw new IllegalArgumentException("toSupplier() can only be called once");
        }
        if (this.to != null) {
            throw new IllegalArgumentException("toSupplier() cannot be called after to()");
        }
        if (this.keyFrames != null) {
            throw new IllegalArgumentException("toSupplier() cannot be called after goingThrough()");
        }
        this.toSupplier = supplier;
        return this;
    }

    public TimelinePropertyBuilder<T> on(Object object) {
        this.target = object;
        return this;
    }

    public TimelinePropertyBuilder<T> interpolatedWith(PropertyInterpolator<T> pInterpolator) {
        if (this.interpolator != null) {
            throw new IllegalArgumentException("interpolatedWith() can only be called once");
        }
        this.interpolator = pInterpolator;
        return this;
    }

    public TimelinePropertyBuilder<T> setWith(PropertySetter<T> pSetter) {
        if (this.setter != null) {
            throw new IllegalArgumentException("setWith() can only be called once");
        }
        this.setter = pSetter;
        return this;
    }

    public TimelinePropertyBuilder<T> getWith(PropertyGetter<T> pGetter) {
        if (this.getter != null) {
            throw new IllegalArgumentException("getWith() can only be called once");
        }
        this.getter = pGetter;
        return this;
    }

    public TimelinePropertyBuilder<T> accessWith(PropertyAccessor<T> pAccessor) {
        if (this.setter != null || this.getter != null) {
            throw new IllegalArgumentException("accessWith() can only be called once");
        }
        this.setter = pAccessor;
        this.getter = pAccessor;
        return this;
    }

    public TimelinePropertyBuilder<T> goingThrough(KeyFrames<? extends T> keyFrames) {
        if (this.keyFrames != null) {
            throw new IllegalArgumentException("goingThrough() can only be called once");
        }
        if (this.isFromCurrent) {
            throw new IllegalArgumentException(
                    "goingThrough() cannot be called after fromCurrent()");
        }
        if (this.from != null) {
            throw new IllegalArgumentException("goingThrough() cannot be called after from()");
        }
        if (this.fromSupplier != null) {
            throw new IllegalArgumentException("goingThrough() cannot be called after fromSupplier()");
        }
        if (this.to != null) {
            throw new IllegalArgumentException("goingThrough() cannot be called after to()");
        }
        if (this.toSupplier != null) {
            throw new IllegalArgumentException("goingThrough() cannot be called after toSupplier()");
        }
        this.keyFrames = keyFrames;
        return this;
    }

    AbstractFieldInfo<T> getFieldInfo(Object mainObject) {
        if (this.target == null) {
            this.target = mainObject;
        }

        if (this.keyFrames != null) {
            return new KeyFramesFieldInfo<>(this.target, this.propertyName, this.keyFrames,
                    this.setter);
        }

        if (this.isFromCurrent) {
            if (this.interpolator == null) {
                this.interpolator = RadianceAnimationCortex.getPropertyInterpolator(
                        Collections.singleton((this.to != null) ? this.to : this.toSupplier.get()));

                if (this.interpolator == null) {
                    throw new IllegalArgumentException(
                            "No interpolator found for " + this.to.getClass().getName());
                }
            }
            return new GenericFieldInfoTo<>(this.target, this.propertyName, this.to, this.toSupplier,
                    this.interpolator, this.getter, this.setter);
        }

        if (this.interpolator == null) {
            this.interpolator = RadianceAnimationCortex.getPropertyInterpolator(
                    Arrays.asList((this.from != null) ? this.from : this.fromSupplier.get(),
                            (this.to != null) ? this.to : this.toSupplier.get()));

            if (this.interpolator == null) {
                throw new IllegalArgumentException("No interpolator found for "
                        + this.from.getClass().getName() + ":" + this.to.getClass().getName());
            }
        }
        return new GenericFieldInfo<>(this.target, this.propertyName, this.from, this.fromSupplier,
                this.to, this.toSupplier, this.interpolator, this.setter);
    }

    abstract static class AbstractFieldInfo<F> {
        protected Object object;

        protected String fieldName;

        protected PropertyGetter<F> getter;
        protected PropertySetter<F> setter;

        protected F from;
        protected Supplier<F> fromSupplier;
        protected F to;
        protected Supplier<F> toSupplier;

        AbstractFieldInfo(Object obj, String fieldName, PropertyGetter<F> pGetter,
                PropertySetter<F> pSetter) {
            this.object = obj;
            this.fieldName = fieldName;

            this.getter = pGetter;
            this.setter = pSetter;
        }

        void setValues(F from, Supplier<F> fromSupplier, F to, Supplier<F> toSupplier) {
            this.fromSupplier = fromSupplier;
            this.from = (this.fromSupplier == null) ? from : this.fromSupplier.get();
            this.toSupplier = toSupplier;
            this.to = (this.toSupplier == null) ? to : this.toSupplier.get();
        }

        abstract void onStart();

        abstract void updateTo();

        abstract void updateFrom();

        abstract boolean isFromCurrent();

        abstract void updateFieldValue(float timelinePosition);
    }

    private static <T> PropertyGetter<T> getPropertyGetter(Object obj, String fieldName,
            PropertyGetter<T> pGetter) {
        if (pGetter != null)
            return pGetter;
        return new DefaultPropertyGetter<>(obj, fieldName);
    }

    private static <T> PropertySetter<T> getPropertySetter(Object obj, String fieldName,
            PropertySetter<T> pSetter) {
        if (pSetter != null)
            return pSetter;
        return new DefaultPropertySetter<>(obj, fieldName);
    }

    private static class GenericFieldInfoTo<T> extends AbstractFieldInfo<T> {
        private PropertyInterpolator<T> propertyInterpolator;

        GenericFieldInfoTo(Object obj, String fieldName, T to, Supplier<T> toSupplier,
                PropertyInterpolator<T> propertyInterpolator, PropertyGetter<T> propertyGetter,
                PropertySetter<T> propertySetter) {
            super(obj, fieldName, getPropertyGetter(obj, fieldName, propertyGetter),
                    getPropertySetter(obj, fieldName, propertySetter));
            this.propertyInterpolator = propertyInterpolator;
            this.toSupplier = toSupplier;
            this.to = (this.toSupplier == null) ? to : this.toSupplier.get();
        }

        @Override
        void onStart() {
            this.from = getter.get(object, fieldName);
            this.updateTo();
        }

        @Override
        void updateFrom() {
        }

        @Override
        void updateTo() {
            if (this.toSupplier != null) {
                this.to = this.toSupplier.get();
            }
        }

        @Override
        boolean isFromCurrent() {
            return true;
        }

        @Override
        void updateFieldValue(float timelinePosition) {
            //System.out.println("updateFieldValue on @" + hashCode());
            try {
                T value = this.propertyInterpolator.interpolate(from, to, timelinePosition);
                this.setter.set(this.object, this.fieldName, value);
            } catch (Throwable exc) {
                System.err.println("Exception occurred in updating field '" + this.fieldName
                        + "' of object " + ((this.object == null) ? "[NONE]"
                        : this.object.getClass().getCanonicalName())
                        + " at timeline position " + timelinePosition);
                exc.printStackTrace();
            }
        }
    }

    private static class GenericFieldInfo<T> extends AbstractFieldInfo<T> {
        private PropertyInterpolator<T> propertyInterpolator;

        GenericFieldInfo(Object obj, String fieldName, T from, Supplier<T> fromSupplier,
                T to, Supplier<T> toSupplier,
                PropertyInterpolator<T> propertyInterpolator, PropertySetter<T> propertySetter) {
            super(obj, fieldName, null, getPropertySetter(obj, fieldName, propertySetter));
            this.propertyInterpolator = propertyInterpolator;
            this.setValues(from, fromSupplier, to, toSupplier);
        }

        @Override
        void onStart() {
            this.updateFrom();
            this.updateTo();
        }

        @Override
        void updateFrom() {
            if (this.fromSupplier != null) {
                this.from = this.fromSupplier.get();
            }
        }

        @Override
        void updateTo() {
            if (this.toSupplier != null) {
                this.to = this.toSupplier.get();
            }
        }

        @Override
        boolean isFromCurrent() {
            return false;
        }

        @Override
        void updateFieldValue(float timelinePosition) {
            try {
                T value = this.propertyInterpolator.interpolate(from, to, timelinePosition);
                this.setter.set(this.object, this.fieldName, value);
            } catch (Throwable exc) {
                System.err.println("Exception occurred in updating field '" + this.fieldName
                        + "' of object " + ((this.object == null) ? "[NONE]"
                        : this.object.getClass().getCanonicalName())
                        + " at timeline position " + timelinePosition);
                exc.printStackTrace();
            }
        }
    }

    private static class KeyFramesFieldInfo<T> extends AbstractFieldInfo<T> {
        KeyFrames<? extends T> keyFrames;

        KeyFramesFieldInfo(Object obj, String fieldName, KeyFrames<? extends T> keyFrames,
                PropertySetter<T> propertySetter) {
            super(obj, fieldName, null, getPropertySetter(obj, fieldName, propertySetter));
            this.keyFrames = keyFrames;
        }

        @Override
        void onStart() {
        }

        @Override
        void updateFrom() {
        }

        @Override
        void updateTo() {
        }

        @Override
        boolean isFromCurrent() {
            return false;
        }

        @Override
        void updateFieldValue(float timelinePosition) {
            if (this.setter != null) {
                try {
                    T value = this.keyFrames.getValue(timelinePosition);
                    this.setter.set(this.object, this.fieldName, value);
                } catch (Throwable exc) {
                    exc.printStackTrace();
                }
            }
        }
    }

    private static Method getSetter(Object object, String propertyName) {
        String setterMethodName = "set" + Character.toUpperCase(propertyName.charAt(0))
                + propertyName.substring(1);
        Class<?> oClazz = object.getClass();
        while (oClazz != null) {
            for (Method m : oClazz.getMethods()) {
                if (setterMethodName.equals(m.getName()) && (m.getParameterTypes().length == 1)
                        && (m.getReturnType() == Void.TYPE)
                        && (!Modifier.isStatic(m.getModifiers()))) {
                    return m;
                }
            }
            oClazz = oClazz.getSuperclass();
        }
        return null;
    }

    private static Method getGetter(Object object, String propertyName) {
        String getterMethodName = "get" + Character.toUpperCase(propertyName.charAt(0))
                + propertyName.substring(1);
        Class<?> oClazz = object.getClass();
        while (oClazz != null) {
            for (Method m : oClazz.getMethods()) {
                if (getterMethodName.equals(m.getName()) && (m.getParameterTypes().length == 0)
                        && (!Modifier.isStatic(m.getModifiers()))) {
                    return m;
                }
            }
            oClazz = oClazz.getSuperclass();
        }
        return null;
    }
}
