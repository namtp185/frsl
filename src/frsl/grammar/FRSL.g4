grammar FRSL;   
metaModel  : useCaseName (NEWLINE useCaseDescription)? NEWLINE actors (NEWLINE precondition)? (NEWLINE postcondition)? (NEWLINE trigger)? (NEWLINE specialRequirement)? NEWLINE flows;
useCaseName: 'UseCase :' use_case_name ;
useCaseDescription: 'BriefDescription :' use_case_description ;
actors: 'Actors :' actor_names;
precondition: 'Precondition :' pre_condition ;
postcondition: 'Postcondition :' post_condition ;
trigger: 'Trigger :' trigger_info ;
specialRequirement: 'SpecialRequirement :' special_requirement ;
flows: basicFlow (NEWLINE alternativeFlows)?;
use_case_name: PHRASE;
use_case_description : STATEMENT;
actor_names: (','|actor_name)+;
actor_name: PHRASE;
pre_condition : STATEMENT;
post_condition : STATEMENT;
trigger_info : STATEMENT;
special_requirement : STATEMENT;
basicFlow: 'BasicFlow :' NEWLINE (basicStep|NEWLINE)+;
alternativeFlows: 'AlternativeFlows :' NEWLINE (alternativeFlow|NEWLINE)+;
basicStep: step ':' STATEMENT;
alternativeFlow: aFlow ':' PHRASE (basicStep|NEWLINE)+;
step: 'Step ' LETTER ;
aFlow: 'Flow ' LETTER ;

// segment
NEWLINE: [\n]+;
STATEMENT: (PHRASE|'.'|',')+'.';
PHRASE : (' 'LETTER)+;
LETTER : [a-zA-Z0-9_]+ ;
NUMBER: [0-9];
WS : [ \t\r]+ -> skip ;