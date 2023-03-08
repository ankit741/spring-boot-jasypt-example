# spring-boot-jasypt-example

Simple jasypt integration with spring boot

# encrypt

mvn jasypt:encrypt -Djasypt.encryptor.password=the password

#decypt

mvn jasypt:decrypt -Djasypt.encryptor.password=the password

#encrypt value

mvn jasypt:encrypt-value -Djasypt.encryptor.password="the password" -Djasypt.plugin.value="theValueYouWantToEncrypt"

#decrypt value

mvn jasypt:decrypt-value -Djasypt.encryptor.password="the password" -Djasypt.plugin.value="theValueYouWantToDcrypt"

#VM arg to decrypt values in application

-Djasypt.encryptor.password=the password


