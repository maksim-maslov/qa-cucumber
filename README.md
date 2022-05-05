
### install

```
    git clone https://github.com/maksim-maslov/qa-cucumber
```

### run tests

```
    mvn clean test       
```

### Структура файлов проекта

```                 	
src/ 
  test/
    java/
      org.example.qa.cucumber/
        page/                                 --> pageobject
        steps/                                --> steps definitions
        test/                                 --> тесты
    resources/                                --> ресурсы
      org.example.qa.cucumber/
        features/                             --> features
        logback-test.xml/                     --> конфигурация logback
pom.xml                                       --> конфигурация maven
.gitignore                                    --> gitignore
README.md                                     --> описание проекта
```
