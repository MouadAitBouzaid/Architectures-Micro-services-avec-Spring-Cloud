# Architectures-Micro-services-avec-Spring-Cloud
Objectif :  
Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.
Travail à faire :

1.Créer le micro-service customer-service qui permet de gérer les client
<img width="746" alt="Capture d’écran 2022-12-07 à 20 30 37" src="https://user-images.githubusercontent.com/77202158/206277731-85b1f23c-f5ac-4dc9-a5c0-feeb95575109.png">


2.Créer le micro-service inventory-service qui permet de gérer les produits

3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage

4. Créer l'annuaire Eureka Discrovery Service

5. Faire une configuration dynamique des routes de la gateway

6. Créer le service de facturation Billing-Service en utilisant Open Feign

7. Créer un client Web Angular (Clients, Produits, Factures)

8. Déployer le serveur keycloak :
     - Créer un Realm
     - Créer un client à sécuriser
     - Créer des utilisateurs
     - Créer des rôles
     - Affecter les rôles aux utilisateurs
     - Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token 

9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak
