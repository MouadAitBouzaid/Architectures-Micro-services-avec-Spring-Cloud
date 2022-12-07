# Architectures-Micro-services-avec-Spring-Cloud
Objectif :  
Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.
Travail à faire :

1.Créer le micro-service customer-service qui permet de gérer les client
<img width="746" alt="Capture d’écran 2022-12-07 à 20 30 37" src="https://user-images.githubusercontent.com/77202158/206277731-85b1f23c-f5ac-4dc9-a5c0-feeb95575109.png">

2.Créer le micro-service inventory-service qui permet de gérer les produits
<img width="712" alt="Capture d’écran 2022-12-07 à 20 32 39" src="https://user-images.githubusercontent.com/77202158/206278183-be96df83-8b75-4b40-ab39-9765c4586493.png">

3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage
4. Créer l'annuaire Eureka Discrovery Service
![Capture d’écran 2022-12-07 à 21 19 07](https://user-images.githubusercontent.com/77202158/206287032-dec0b2b4-cb5b-4f83-88f1-bba29d29cced.png)

5. Faire une configuration dynamique des routes de la gateway
<img width="875" alt="Capture d’écran 2022-12-07 à 22 42 14" src="https://user-images.githubusercontent.com/77202158/206302883-cee36b4d-6b99-4191-9a56-e94680c47194.png">

6. Créer le service de facturation Billing-Service en utilisant Open Feign
![Capture d’écran 2022-12-07 à 21 55 20](https://user-images.githubusercontent.com/77202158/206293805-61d8209d-2bf4-4279-b1af-2a4ecfc7bcd4.png)


7. Créer un client Web Angular (Clients, Produits, Factures)

Produits : 
![206163976-a1e54bb6-bc3c-4285-ba2c-ea25df3a55fa](https://user-images.githubusercontent.com/77202158/206294363-f87fc7f4-907f-40c2-bbad-2f1e3cd0fca4.png)
Clients : 
![206164177-5545d2be-f01e-48a7-95b4-3c32fc9800e1](https://user-images.githubusercontent.com/77202158/206294672-295db585-9fac-4b1a-9b85-c5c872ac643d.png)


8. Déployer le serveur keycloak :
     - Créer un Realm
![Capture d’écran 2022-12-07 à 22 02 27](https://user-images.githubusercontent.com/77202158/206295109-a18e8ebc-7749-42f6-8683-a76685b954c9.png)
     - Créer un client à sécuriser
![Capture d’écran 2022-12-07 à 22 10 03](https://user-images.githubusercontent.com/77202158/206296414-c04caab1-7d70-424d-9a0c-5364a0f22bc2.png)
     - Créer des utilisateurs
![Capture d’écran 2022-12-07 à 22 10 33](https://user-images.githubusercontent.com/77202158/206296496-1772a6c9-fd10-4a8e-9471-4a7fc9c032ab.png)
     - Créer des rôles
![Capture d’écran 2022-12-07 à 22 11 08](https://user-images.githubusercontent.com/77202158/206297386-2911963d-e178-4edc-b537-55c3469c07a4.png)
     - Affecter les rôles aux utilisateurs
![Capture d’écran 2022-12-07 à 22 14 39](https://user-images.githubusercontent.com/77202158/206298023-fe9e78b5-3fea-4b30-a6f4-eb6c8d91e167.png)
     - Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token 
![206165416-4566a031-3a20-4085-b29a-2b3af76b558c](https://user-images.githubusercontent.com/77202158/206298466-7d1d1e7c-9551-4c79-9bb2-93ee6ebb18cc.png)

9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak
![Capture d’écran 2022-12-07 à 22 19 13](https://user-images.githubusercontent.com/77202158/206302305-85ca3284-30d7-400c-9861-d5f4d042e1db.png)

![206165669-4d2e8dd5-8891-4e4e-98f5-7bc9edce6d53](https://user-images.githubusercontent.com/77202158/206302414-7efe491e-c449-44a8-99ae-3bdbb9bade7e.png)

