A Spring Boot backend API for a basic Flight Management System that designed to streamline the process of managing flight data.
<br>
## Roles
<ol>
  <li> Admin
    <ul>
      <li>Can add, delete and update flights and airports</li>
      <li>Manage user' account activation</li>
      <li>Can search flights and available airports</li>
    </ul>
  </li>
  <li> User
    <ul>
      <li>Can search flights and available airports</li>
    </ul>
  </li>
</ol>
<br>

## Properties
<ol>
  <li> Basic CRUD operations for flight and airport objects. </li>
  <li> Search API to filter flight data that enables advanced flight search capabilities based on various criteria such as departure place, destination place, departure and return dates.</li>
  <li> Authentication using JWT. </li>
  <li> Scheduled background jobs to update the flights database daily. </li>
  <li> Swagger Documentation. </li>
  <li> Integrated with PostgreSQL for robust data storage. </li>
</ol>
<br>

## Database Design

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/093f2b3b-e11d-4560-b2ed-9cc7d03e1310" width="800" alt="Database Entity-Relationship Diagram with users, flights and airports tables."/>
</p>

## Screenshots

### CRUD

#### Fligt Get & Update

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/4e6be08d-93d8-4d3d-9829-c8a2cecfd004" width="800" alt="Get by code."/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/2bc805c0-92df-4071-a02d-e4ede26d601b" width="800" alt="Update Flight"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/cc329539-f0c1-4581-8747-c98131374e23" width="800" alt="Get updated flight"/>
</p>

#### User Get & Update

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/1d73c1ef-8ceb-4bf5-8c8f-5ccea596a82a" width="800"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/e9459f9c-9d7b-4f95-a596-725ec1b2b671" width="800"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/bcb1d613-3c33-4ae6-ae55-589819bbd0a0" width="800"/>
</p>

#### Post Airports & Flights

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/ba2a299c-697b-4ff5-92fa-4d96662add93" width="800" alt = "Post airport."/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/3084f737-b5ad-4f36-bff1-ca5f71a6f662" width="800" alt = "Post flight."/>
</p>

#### Airport Get, Update & Delete

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/928a3a09-fb31-43d2-8fea-73bed2deeff4" width="800"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/ecac3bf9-08c9-4643-8013-646be5f64e71" width="800"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/31645270-c47c-4592-816a-2b4965d009ae" width="800"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/0782fb7d-161e-4c66-b263-fb4743f58dd3" width="800"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/f6a5f1e3-4e26-44c2-a3f0-9c78bdc574c7" width="800"/>
</p>

#### Flight Update & Delete

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/1c1e3335-e221-4c4b-8fc6-1ea68c43dddb" width="800" alt = "Get Flight"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/42d570c2-6131-4421-b24a-6ccd191a978c" width="800" alt = "Delete Flight"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/8f23359f-d1f2-4825-b123-ca237bb9a2d0" width="800" alt = "Deleted Flight"/>
</p>

### Register & Login

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/74de4daa-d8fe-4be1-aa7a-19b725964ae1" width="800" alt="Admin Login"/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/f45c5b83-d096-4cdd-b743-8eace5b883cc" width="800" alt="User Register."/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/000bbb3a-e703-4be3-8083-3be99b56ff97" width="800" alt="List of all users."/>
</p>


### Search API

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/8acbb88a-9d18-414f-8357-7af36006e328" width="800" alt="Search request example - 1."/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/6e76900f-0fa8-4dc2-9ae9-ff54ff0aaafd" width="800" alt="Search request example - 2."/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/3d622947-74fe-413c-9564-86318fe90deb" width="800" alt="Get by code - 2."/>
</p>

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/315d636b-0913-44bc-a36a-3ad4a88038c8" width="800" alt="Search above flight."/>
</p>

### Scheduled Job

> [!NOTE]  
> To quickly test the scheduled jobs without waiting for daily execution, I configured the schedule to run every five minutes using the ```@Scheduled(fixedRate = 300000, initialDelay = 30000) annotation```.

<p align="center">
  <img src="https://github.com/elifnurafsar/xxx/assets/60623941/0b8dbbd4-c6ee-44ac-8418-58aa257cb44a" width="800" alt="Scheduled job test passed screenshot."/>
</p>

[YouTube video link](https://youtu.be/CZRvubpT_-k)


### Swagger Documentation 
![usercontreoller](https://github.com/elifnurafsar/xxx/assets/60623941/2f6934da-143b-417e-b70b-34a48fb6f192)

![flightcontroller](https://github.com/elifnurafsar/xxx/assets/60623941/16167329-3f9b-4559-907a-cc0c556cf1f3)

![airportcontroller](https://github.com/elifnurafsar/xxx/assets/60623941/883fd411-abd3-439c-9132-b64859f06e5b)

![schemas](https://github.com/elifnurafsar/xxx/assets/60623941/76123b85-81c5-4c0e-8cca-b8aad06de249)


End.
