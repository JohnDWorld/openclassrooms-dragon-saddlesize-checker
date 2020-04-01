# Calculateur de taille de selle de dragon

# This Branch

Cette branche est réalisée pour la gestion des logs.

# Your challenge 

* Add info and debug level logging to the DragonSaddleSizeVerifier class.
  * Create a new Logger in that class, passing in that Class to the slf4j LoggerFactory.
  * Add Info, Debug level logging to that class.
  * Add Error level logging before throwing an exception.
  * Check the log level in  src/main/resources/application.properties.
  * Start the application with `./gradlew bootRun`
  * Visit http://localhost:9999/dragon/size to see an estimate
  * Visit http://localhost:9999/dragon/size/year/-2 to cause an InvalidSaddleSizeException
  * Check the logs.
  * Change the log levels and try again.
  
# Le bug qui a vaincu un dragon
Comme chacun sait, les dragons sont des créatures mythiques qui n'existent pas dans la nature. Pas naturellement, en fait. 

Ce que vous ne savez peut-être pas, c'est qu'en l'an 1 de notre ère, le sage alchimiste Lou Tan Dey-ta a réussi à créer plusieurs dragons en utilisant des moyens non naturels et un certain nombre de potions pétillantes.
Ces dragons volent encore dans le ciel aujourd'hui.

Les dragons vivent extrêmement longtemps et grandissent à un rythme constant, mais lent. 
Acheter la bonne selle de dragon est une affaire délicate.

Afin d'aider ceux qui ont la chance de monter un jour sur ces dragons,
Lou Tan a publié un algorithme de calcul de la taille d'une selle basé
sur l'âge d'un dragon. 

Des siècles plus tard, cet algorithme a été réécrit à la hâte en Java afin d'aider ceux qui ont la chance d'avoir besoin de selles de dragon. 

Malheureusement, le code laisse beaucoup à désirer : il y a maintenant un bug.

# Exécution de cette application

### Calculer la taille de selle d'un dragon en fonction de l'année

`./gradlew bootRun`

Cela démarrera votre application.

* Visit http://localhost:9999/dragon/size pour voir le calcul pour l'année en cours
* Visit http://localhost:9999/dragon/size/year/2019 pour voir le calcul pour l'année 2019.


