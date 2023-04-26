# Demo Shell App for CDM Design Principle

## Build rosetta-source

```bash
cd ../resetta-source
mvn clean install -s ../settings.xml
```

## Shell Usage

### Build the Shell

```bash
mvn clean install -s ../settings.xml
```

### Use the Shell

```bash
# start shell
mvn spring-boot:run #or faster
java -jar target/shell-0.0.0-master.jar
# find help
shell:>help
# exit shell
shell:>exit
```