/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.photon.api.transcoder.java;

import org.pushingpixels.photon.api.transcoder.LanguageRenderer;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaLanguageRenderer implements LanguageRenderer {
    @Override
    public String getStatementEnd() {
        return ";";
    }
    
    @Override
    public String getObjectCreation(String className) {
        return "new " + className;
    }
    
    @Override
    public String getObjectCreationNoParams(String className) {
        return "new " + className + "()";
    }
    
    @Override
    public String getObjectCast(String objectName, String classToCastTo) {
        return "((" + classToCastTo + ")" + objectName + ")";
    }

    @Override
    public String getObjectNoNull(String objectName) {
        return objectName;
    }

    @Override
    public String startPrimitiveArrayOf(String primitiveTypeName) {
        return "new " + primitiveTypeName + "[] {";
    }
    
    @Override
    public String startGenericArrayOf(String className) {
        return "new " + className + "[] {";
    }
    
    @Override
    public String endArray() {
        return "}";
    }
    
    @Override
    public String startVariableDefinition(String variableTypeName) {
        return variableTypeName + " ";
    }
    
    @Override
    public String startSetterAssignment(String propertyName) {
        return ".set" + Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1) + "(";
    }
    
    @Override
    public String endSetterAssignment() {
        return ")";
    }

    @Override
    public String getGetter(String propertyName) {
        return ".get" + Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1) + "()";
    }

    @Override
    public String startMethod(String methodName, MethodArgument... arguments) {
        return "private void " + methodName + "(" +
                Stream.of(arguments).map(e -> e.type + " " + e.name).collect(Collectors.joining(",")) +
                ") {";
    }

    @Override
    public String endMethod() {
        return "}";
    }

    @Override
    public String getPrimitiveTypeFor(Class<?> clazz) {
        if (clazz == int.class) return "int";
        if (clazz == double.class) return "double";
        if (clazz == float.class) return "float";
        if (clazz == boolean.class) return "boolean";
        if (clazz == char.class) return "char";
        throw new UnsupportedOperationException(clazz.toString());
    }
}
