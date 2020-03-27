/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.photon.api.transcoder.kotlin;

import org.pushingpixels.photon.api.transcoder.LanguageRenderer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KotlinLanguageRenderer implements LanguageRenderer {
    @Override
    public String getStatementEnd() {
        return "";
    }
    
    @Override
    public String getObjectCreation(String className) {
        return className;
    }
    
    @Override
    public String getObjectCreationNoParams(String className) {
        return className + "()";
    }
    
    @Override
    public String getObjectCast(String objectName, String classToCastTo) {
        return "(" + objectName + " as " + classToCastTo + ")";
    }

    @Override
    public String startPrimitiveArrayOf(String primitiveTypeName) {
        return primitiveTypeName + "ArrayOf(";
    }
    
    @Override
    public String startGenericArrayOf(String className) {
        return "arrayOf(";
    }
    
    @Override
    public String endArray() {
        return ")";
    }

    @Override
    public String startVariableDefinition(String variableTypeName) {
        return "val ";
    }
    
    
    @Override
    public String startSetterAssignment(String propertyName) {
        return "." + propertyName + " = ";
    }
    
    @Override
    public String endSetterAssignment() {
        return "";
    }

    @Override
    public String getGetter(String propertyName) {
        return "." + propertyName;
    }

    @Override
    public String startMethod(String methodName, MethodArgument... arguments) {
        return "private fun " + methodName + "(" +
                Stream.of(arguments).map(e -> e.name + " : " + e.type).collect(Collectors.joining(",")) +
                ") {";
    }

    @Override
    public String endMethod() {
        return "}";
    }

    @Override
    public String getPrimitiveTypeFor(Class<?> clazz) {
        if (clazz == int.class) return "Int";
        if (clazz == double.class) return "Double";
        if (clazz == float.class) return "Float";
        if (clazz == boolean.class) return "Boolean";
        if (clazz == char.class) return "Char";
        throw new UnsupportedOperationException(clazz.toString());
    }
}
