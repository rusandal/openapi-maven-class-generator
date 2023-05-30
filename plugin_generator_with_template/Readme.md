# Generate Java classes from *.yml (openapi) with mustache templates
Pre-read the description of the basic functionality in the plugin-generator module. 

## Description 
In the previous module, we used the basic features of the maven generation plugin. But if the configuration capabilities of the plugin are not enough, then the mustache templates can help us.
For example, if we want to add an annotation above a field, then we can:
1. Edit the openapi model by adding x-field-extra-annotation to the field description
2. Use the moustache template. Let's get started

## Configuration
pom.xml 
1. Mustache template path.
```
...
<templateDirectory>${project.basedir}/templates</templateDirectory>
...
```
2. Download [POJO mustache template](https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/JavaInflector/pojo.mustache)
3. Find the part of the code responsible for the desired block. I want to add serialization and deserialization annotations with the date-time type
```
...
{{#isDateTime}}
@com.fasterxml.jackson.databind.annotation.JsonSerialize(using=com.fasterxml.jackson.datatype.jsr310.ser.OffsetDateTimeSerializer.class)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.vladmihalcea.hibernate.type.util.ObjectMapperWrapper.OffsetDateTimeDeserializer.class)
{{/isDateTime}}
  ...
```
