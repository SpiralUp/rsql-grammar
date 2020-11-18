# RSQL Grammar

RSQL grammar defined in ANTLR4.

RSQL can be used for filtering REST API requests. For example, the filter "(firstName=='Mario')and(age=GT=20)" will create a sql condition "where firstName='Mario' and age>20".   

Two grammars a provided:

- **RsqlWhere** for defining filters (where conditions) for sql statements.
  The source for this grammar is defined in *./src/main/antlr/RsqlWhere.g4*.

- **RsqlSelect** for defining projections (select part of the sql statement).
  The source for this grammar is defined in *./src/main/antlr/RsqlSelect.g4*.


This work is inspired by the following works and articles:

- [jirutka/rsql-parser github repository](https://github.com/jirutka/rsql-parser),
- [REST Query Language with RSQL by Eugen Paraschiv in Baeldung](https://www.baeldung.com/rest-api-search-language-rsql-fiql)


## Grammar diagrams

[RsqlWhere grammar diagram](https://raw.github.com/spiralUp/rsql-grammar/src/main/docs/RsqlWhere.html),
[RsqlSelect grammar diagram](https://raw.github.com/spiralUp/rsql-grammar/src/main/docs/RsqlSelect.html)

## The language

### Filters (where grammar)

The language is in the form **field condition literal**.  For example *name=='Mario'*.

A field can be defined as a paths: *field1.field2* - the *field1* from the basic entity is of another entity type, and *field2* is an attribute on the second entity.

Simple condition can be composed with "**and**" and "**or**". The "**and**" can be replaced with "**;**", and "**or** can be replaced with "**,**".  For example *'firstName=='Mario' and age=gt=20*.

Condition can be put in parenthases, for example *('firstName=='Mario' and age=gt=20) or firstName=='Ana'*.


#### Supported operators


| Operator | Description 
|----------|-------------
| == | Equal
| != *or* =!  | Not equal
| =gt= | Greater then (>)
| =ge= | Greater or equal (>=)
| =lt= | Less then (<)
| =le= | Less or equal (<=)
| =like= *or* =* | LIKE operator, for example *name=like='Mar\*'*
| =bt= | BETWEEN operator, for example *age=bt=(20,30)* means *age between 20 and 30*
| =in= | IN operator, for example *name=in=('Mario','Ana') means *name in ('Mario','Ana')*
| =nin= | NOT IN operator, for example *name=nin=('Mario','Ana') means *name not in ('Mario','Ana')*
| ==null | IS NULL operator, for example *name==null* means *name is null*
| !=null | IS NOT NULL operator, for example *name!=null* means *name is not null*


#### Supported data types

The following data types are supported for literals:

- String: some text between quotes (**'** or **"**)
- Integers/longs
- Real numbers
- Date
- Date and time
- Enumerations: some identifiers between ##, for example *#ACTIVE#*
- Other field identifier, for example *firstName==secondName*
- Query parameter: some identifier strating with ':' for example *name==:param*

## Examples


    name=*'Mar*';age=gt=16
    name=in=('Mario','Ana','Lidija')
    age=bt=(18,120)
    firstName==secondName
    age==null
    (name=='Mario')and(age!=null)
    status=in=(#NEW#,#ACTIVE#)
    age=:param

