## FinanceApp (Projekat 1 - Programiranje u javi)

FinanceApp je jednostavna desktop aplikacija razvijena u Javi, koja omogućava korisnicima unos, praćenje i analizu ličnih prihoda i rashoda. Cilj aplikacije je da studentima posluži kao praktičan primjer CRUD operacija, rada sa bazama podataka i izrade GUI-ja u IntelliJ IDEA


## Šta aplikacija radi
- vrši unos transakcija (prihodi i rashodi)
- podaci se spremaju u MongoDB
- svi unosi se prikazuju u tabeli u GUI-u
- izračunava ukupni prihod, rashod i trenutno stanje
- podaci se mogu eksportovati i sačuvaju u TXT fajl 
- prikaz rashoda po kategorijama
  
## Korištene tehnologije
- Java (IntelliJ IDEA)
- Swing (pravila sam GUI preko form designer-a)
- MongoDB lokalni
- Mongo driver za Javu

## Kako izgleda struktura projekta 

-com.amilaselimbasic.financeapp
── db
     Database.java

── model
     Transaction.java

── ui
     MainForm.java
     MainForm.form

  Main.java

  
## Kako pokrenuti
Da bi aplikacija radila treba da bude upaljen MongoDB na localhostu (localhost:27017).  
Nakon toga se samo pokrene `Main.java` u IntelliJ-u.

## Kako se koristi
-U aplikaciji se unese iznos, opis, tip i kategorija  
-Klikne se na dugme **Dodaj** i pojavi se u tabeli  
-Sve se automatski računa
Ako korisnik hoće sačuvati dokument TXT, klikne na dugme za Exsport

## Napomene
- GUI se ponekad malo poremeti kad se mijenjaju boje, ali radi
- Ako MongoDB nije pokrenut onda neće ništa raditi

## Autor
Amila Selimbasic
Projekat urađen za predmet PROGRAMIRANJE U JAVI  
Akademska godina: 2025/2026
