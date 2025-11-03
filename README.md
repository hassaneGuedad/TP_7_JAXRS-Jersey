💳 MS-Banque
Application Spring Boot pour la gestion des comptes bancaires, utilisant JPA et une base de données H2 en mémoire.

🔧 Prérequis
Avant de lancer l'application, assure-toi d'avoir installé :

Java 17+

Maven

Postman (pour tester les APIs)

Un navigateur pour accéder à la console H2

🚀 Lancement de l'application
1. Cloner le projet
git clone https://github.com/hassaneGuedad/TP_7_JAXRS-Jersey.git
cd ms-banque
2. Démarrer avec Maven

mvn spring-boot:run
L'application démarre par défaut sur le port 8082.

🌐 Accès rapide
API de test : http://localhost:8082/banque/comptes

H2 Console : http://localhost:8082/h2-console

Paramètres H2 Console :

JDBC URL : jdbc:h2:mem:banque

Utilisateur : SA

Mot de passe : (laisser vide)

🧾 API Endpoints
Méthode	Endpoint	Description
GET	/banque/comptes	Lister tous les comptes
GET	/banque/comptes/{id}	Obtenir un compte par ID
POST	/banque/comptes	Ajouter un compte
PUT	/banque/comptes/{id}	Mettre à jour un compte
DELETE	/banque/comptes/{id}	Supprimer un compte
🧪 Tests via Postman
1️⃣ Ajouter un compte
http
POST http://localhost:8082/banque/comptes
Content-Type: application/json
json
{
  "solde": 12000,
  "dateCreation": "2025-11-03",
  "type": "COURANT"
}
2️⃣ Mettre à jour un compte
http
PUT http://localhost:8082/banque/comptes/1
Content-Type: application/json
json
{
  "solde": 15000,
  "dateCreation": "2025-11-03",
  "type": "EPARGNE"
}
3️⃣ Supprimer un compte
http
DELETE http://localhost:8082/banque/comptes/1
📷 Captures d'écran
H2 Console
<img width="960" height="510" alt="tp1" src="https://github.com/user-attachments/assets/b8b051bc-fd3c-49ff-96c6-1bfd4443e044" />

<img width="960" height="510" alt="tp7_1" src="https://github.com/user-attachments/assets/71c76e2e-a42b-4f20-9b18-3ff575a69550" />


<img width="960" height="510" alt="tp7_2" src="https://github.com/user-attachments/assets/2a6d138c-026e-4937-a88c-2ed203f8fddf" />

<img width="960" height="510" alt="tp7_3" src="https://github.com/user-attachments/assets/2beff877-83bf-40e5-bc61-d8a0f6571af3" />

<img width="960" height="510" alt="tp7_4" src="https://github.com/user-attachments/assets/76896237-9360-4a4f-8c65-b6bc51b8764f" />

<img width="960" height="510" alt="tp7_5" src="https://github.com/user-attachments/assets/dd9dbf9c-613c-472f-ad73-adea63858258" />


📝 Remarques
La base de données H2 utilisée est volatile : elle se réinitialise à chaque redémarrage de l'application.
