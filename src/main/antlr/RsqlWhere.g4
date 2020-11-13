grammar RsqlWhere;

import RsqlCommonLexer;

/** The start rule; begin parsing here. */
where:   condition+ ;

condition:
        singleCondition # conditionSingle
    | '(' condition ')'        # conditionParens
    | condition (AND | SEMI) condition  # conditionAnd
    | condition (OR | COMMA) condition   # conditionOr
;

inList
    : (inListElement) (',' inListElement)*
;

inListElement
    : STRING_LITERAL
    | DATE_LITERAL
    | DATETIME_LITERAL
    | DECIMAL_LITERAL
    | REAL_LITERAL
    | ENUM_LITERAL
    | field
;

singleCondition
    :
        field operatorBT LR_BRACKET inListElement COMMA inListElement RR_BRACKET # singleConditionBetween
    |   field operatorIN LR_BRACKET inList RR_BRACKET  # singleConditionIn
    |   field operatorNIN LR_BRACKET inList RR_BRACKET  # singleConditionNotIn
    |   field operator STRING_LITERAL  # singleConditionString
    |   field operator DATE_LITERAL    # singleConditionDate
    |   field operator DATETIME_LITERAL    # singleConditionDatetime
    |   field operator DECIMAL_LITERAL # singleConditionDecimal
    |   field operator REAL_LITERAL    # singleConditionReal
    |   field operator field # singleConditionOtherField
    |   field operatorBasic ENUM_LITERAL    # singleConditionEnum
    |   field operatorBasic NULL    # singleConditionNull
    ;



AND: A N D ;
OR: O R ;
NULL: N U L L;

operator
        :     operatorEQ
            | operatorNEQ
            | operatorLT
            | operatorGT
            | operatorLE
            | operatorGE
            | operatorLIKE
            ;

operatorBasic
        :  operatorEQ
        | operatorNEQ
;

operatorEQ: '==';
operatorNEQ: '=!' | '!=';
operatorGT: '=' GT '=';
operatorLT: '=' LT '=';
operatorGE: '=' GE '=';
operatorLE: '=' LE '=';
operatorLIKE: '=*' | '=' LIKE '=';
operatorIN: '=' IN '=';
operatorNIN: '=' NIN '=';
operatorBT: '=' BT '=';

GT: G T;
LT: L T;
GE: G E;
LE: L E;
LIKE : L I K E;
NIN : N I N;
IN: I N;
BT: B T;

field:  ID(DOT_ID)*;

