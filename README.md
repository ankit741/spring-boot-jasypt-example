# spring-boot-jasypt-example

Simple jasypt integration with spring boot

#encrypt

mvn jasypt:encrypt -Djasypt.encryptor.password=the password

#decypt

mvn jasypt:decrypt -Djasypt.encryptor.password=the password

#encrypt value

mvn jasypt:encrypt-value -Djasypt.encryptor.password="the password" -Djasypt.plugin.value="theValueYouWantToEncrypt"

#decrypt value

mvn jasypt:decrypt-value -Djasypt.encryptor.password="the password" -Djasypt.plugin.value="theValueYouWantToDcrypt"

#encrpt a specific file

mvn jasypt:encrypt -Djasypt.encryptor.password="the password" -Djasypt.plugin.path="file:src/main/resources/application.yml"

#VM arg to decrypt values in application

-Djasypt.encryptor.password=the password


