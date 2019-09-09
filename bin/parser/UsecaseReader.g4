grammar UsecaseReader;

usecaseList: (usecase|EOL)+ ;

usecase: ucName EOL (flow|(briefDesc|precondition|actor|dependency|generalization)EOL)+ ;

ucName: 'Use Case Name ' statement ;

briefDesc: 'Brief Description ' statement ;

precondition: 'Precondition ' statement ;

actor: actorType WS ('Actor'|'Actors') WS statement ;

actorType: 'Primary'|'Secondary' ;

dependency: 'Dependency ' specialKeyword? statement ;

generalization: 'Generalization ' specialKeyword? statement ;

flow: (flowType WS ('Flow'|'Flows') EOL) rfs? steps postCondition ;

flowType: ('Basic'|'Bounded Alternative'|'Global Alternative'|'Specific Alternative') ;

rfs: 'RFS ' flowType WS ('Flow'|'Flows') WS Number ('-'Number)? EOL ;

steps: (step|conditionalLogic)+ ;

step: Number WS sentence EOL ;

sentence: statement? specialKeyword? statement? ;

specialKeyword: ('INCLUDE USE CASE'|'EXTENDED BY USE CASE'|'MEANWHILE'|'VALIDATES THAT') ;

conditionalLogic: ('ELSE'|'ENDIF'|'DO'|'UNTIL'|('IF'|'ELSEIF') statement 'THEN') EOL ;

postCondition: 'Postcondition ' statement EOL ;

statement: (Word|Number|Punctuation|WS)+ ;

Word: [a-zA-Z]+ ;
Number: [0-9]+ ;
Punctuation: [,.\-] ;
EOL: '\r'? '\n' ;
WS : [ \t]+ ;