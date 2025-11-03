# MS-Banque

Application Spring Boot pour la gestion des comptes bancaires avec JPA et H2 Database.

---

## 🔧 Prérequis

- Java 17+
- Maven
- Postman (pour tester les APIs)
- Navigateur pour H2 Console

---

## 🚀 Lancer l'application

1. Cloner le projet :  
```bash
git clone https://github.com/hassaneGuedad/TP_7_JAXRS-Jersey.git
cd ms-banque
Lancer l'application avec Maven :

bash
Copier le code
mvn spring-boot:run
L'application démarre sur le port 8082 par défaut.

URL API de test : http://localhost:8082/banque/comptes

H2 Console : http://localhost:8082/h2-console

⚠️ JDBC URL dans H2 Console : jdbc:h2:mem:banque
Utilisateur : SA
Mot de passe : (vide)

🧾 API Endpoints
Méthode	Endpoint	Description
GET	/banque/comptes	Lister tous les comptes
GET	/banque/comptes/{id}	Obtenir un compte par ID
POST	/banque/comptes	Ajouter un compte
PUT	/banque/comptes/{id}	Mettre à jour un compte
DELETE	/banque/comptes/{id}	Supprimer un compte

🧪 Test via Postman
1️⃣ Ajouter un compte (POST)
json
Copier le code
POST http://localhost:8082/banque/comptes
Content-Type: application/json

{
  "solde": 12000,
  "dateCreation": "2025-11-03",
  "type": "COURANT"
}
2️⃣ Mettre à jour un compte (PUT)
json
Copier le code
PUT http://localhost:8082/banque/comptes/1
Content-Type: application/json

{
  "solde": 15000,
  "dateCreation": "2025-11-03",
  "type": "EPARGNE"
}
3️⃣ Supprimer un compte (DELETE)
json
Copier le code
DELETE http://localhost:8082/banque/comptes/1
📷 Captures d'écran
H2 Console

Postman - Ajouter un compte

Postman - Mettre à jour un compte

Postman - Supprimer un compte

⚠️ Remplacer les images par vos propres captures dans le dossier captures/.

📝 Remarques
La base de données utilisée est H2 en mémoire, elle se réinitialise à chaque redémarrage de l'application.

Les données ne sont donc pas persistées
