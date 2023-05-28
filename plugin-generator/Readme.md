# Generate Java classes from *.yml (openapi)

### Description
Generating a class from a file (resource/static/person.yml) to a folder (/target/generated-source)

### Generating
To generate the class just run
```
mvn clean compile
```

### Result generate example
Above class
```
/**
 * Модель человека
 */
@lombok.experimental.SuperBuilder
@Schema(name = "Person", description = "Модель человека")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T11:03:43.583828+03:00[Europe/Moscow]")
```
Class example
```
private String surname;
private String name;
@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
private LocalDate birthDate;
private Integer height;
@Valid
private List<@Valid Address> address;
... constructor equals hashCode setter
```
Getter example
```
@NotNull 
@Schema(name = "text", description = "Адрес строкой", requiredMode = Schema.RequiredMode.REQUIRED)
@JsonProperty("text")
```
