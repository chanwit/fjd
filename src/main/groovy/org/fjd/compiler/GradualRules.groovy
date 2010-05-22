package org.fjd.compiler

import org.fjd.ast.*

@Typed class GradualRules {

    ClassTable  CT
    Environment TT
    
    // C|D = case(C, D) of
    //  (_,Dynamic) => Dynamic    
    boolean maskOff(ClassNode C, ClassNode D) {
        if(D == ClassTable.dynamic) return ClassTable.dynamic
    }
    
    boolean consistent(ClassNode C, ClassNode D) {
        
    }
    
    boolean consistentSubClassOf(ClassNode C, ClassNode D) {
        
    }

}