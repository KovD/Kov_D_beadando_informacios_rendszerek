# Könyvkezelő Alkalmazás (A és B komponens)

Ez a projekt egy elosztott architektúrájú könyvkezelő alkalmazás, amely egy frontend (A komponens) és egy backend (B komponens) szétválasztásával valósult meg.

## Projekt felépítése

A feladat követelményeinek megfelelően a rendszer két fő részből áll:

1.  **'A' komponens (Frontend):** * Technológia: **Nginx** webszerver.
    * Feladata: A felhasználói felület (HTML/JS) kiszolgálása.
    * Elérhetőség: [http://localhost:80](http://localhost:80)
    * Funkciók: Könyvek listázása és új könyv felvétele.

Nem tudom hogy megoldhattam volna-e úgy is, hogy a rontend adja vissza a HTML-t de én így értelmeztem az elosztott rendszert A és B komponensét.

2.  **'B' komponens (Backend):**
    * Technológia: **Java (Tomcat 9)**, JAX-RS (Jersey) keretrendszerrel.
    * Adatbázis: **MongoDB Atlas** (NoSQL felhő alapú adatbázis).
    * Elérhetőség: [http://localhost:8080](http://localhost:8080)
    * Feladata: REST API biztosítása az adatbázis műveletekhez.

## Technológiai megjegyzés
A projekt konténerizált környezetben, **Docker** segítségével fut. 
Mivel Docker képességeimet meghaladta két teljesen külön álló komponens összekapcsolása, így a mesterséges inteligencia segtségét kértem esetleges megoldáshoz, aki az Nginx használatát javasolta.... Amennyiben a HTML-t a szerver is visszaadhatta volna, akkor elég lett volna egy Dockerfile és nem kell két külön localhost

## Telepítés és futtatás

A futtatáshoz Docker Desktop szükséges.


1.  **Indítás:**
    A projekt gyökérmappájában (ahol a `docker-compose.yml` található) futtassa a következő parancsot (.war file-t is odaadtam):
    ```bash
    docker-compose up --build -d
    ```

2.  **Használat:**
    * A webes felület a **http://localhost** (80-as port) címen érhető el.
    * A REST API közvetlenül is tesztelhető a **http://localhost:8080/rest/books** címen (itt visszakerülnek a mongo Db ATLASBól a könyvek).

## Felhasznált technológiák
* **Frontend:** HTML5, JavaScript (Fetch API), Nginx
* **Backend:** Java 17, JAX-RS (Jersey), Maven
* **Adatbázis:** MongoDB Atlas
* **Infrastruktúra:** Docker, Docker Compose