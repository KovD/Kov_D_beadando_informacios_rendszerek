# Könyvkezelő Alkalmazás (A és B komponens)

Ez a projekt egy elosztott architektúrájú könyvkezelő alkalmazás, amely egy frontend (A komponens) és egy backend (B komponens) szétválasztásával valósult meg.

## Projekt felépítése

A feladat követelményeinek megfelelően a rendszer két fő részből áll:

1.  **'A' komponens (Frontend):** * Technológia: **Nginx** webszerver.
    * Feladata: A felhasználói felület (HTML/JS) kiszolgálása.
    * Elérhetőség: [http://localhost:80](http://localhost:80)
    * Funkciók: Könyvek listázása és új könyv felvétele.

2.  **'B' komponens (Backend):**
    * Technológia: **Java (Tomcat 9)**, JAX-RS (Jersey) keretrendszerrel.
    * Adatbázis: **MongoDB Atlas** (NoSQL felhő alapú adatbázis).
    * Elérhetőség: [http://localhost:8080](http://localhost:8080)
    * Feladata: REST API biztosítása az adatbázis műveletekhez.

## Technológiai megjegyzés
A projekt konténerizált környezetben, **Docker** segítségével fut. 
Mivel Docker képességeimet meghaladta két teljesen külön álló komponens összekapcsolása, így a mesterséges inteligencia segtségét kértem esetleges megoldáshoz, aki az Nginx használatát javasolta....

## Telepítés és futtatás

A futtatáshoz Docker Desktop szükséges.

1.  **Fordítás (Backend):**
    Lépjünk be a Java projekt mappájába, majd futtassa a Maven buildet:
    ```bash
    mvn clean package
    ```

2.  **Indítás:**
    A projekt gyökérmappájában (ahol a `docker-compose.yml` található) futtassa a következő parancsot:
    ```bash
    docker-compose up --build -d
    ```

3.  **Használat:**
    * A webes felület a **http://localhost** (80-as port) címen érhető el.
    * A REST API közvetlenül is tesztelhető a **http://localhost:8080/rest/books** címen (itt visszakerülnek a mongo Db ATLASBól a könyvek).

## Felhasznált technológiák
* **Frontend:** HTML5, JavaScript (Fetch API), Nginx
* **Backend:** Java 17, JAX-RS (Jersey), Maven
* **Adatbázis:** MongoDB Atlas
* **Infrastruktúra:** Docker, Docker Compose