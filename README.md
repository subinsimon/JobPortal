# JobPortal
A Simple Rest service for job portal

Sample rest for save
  {
    "id": "1",
    "user": "Subin",
    "location": "Oslo",
    "industry": "IT",
    "employeeType": "full time",
    "sector": "private",
    "numOfPositions": "3",
    "skills": [
      "Java",
      "J2EE",
      "Spring"
    ],
    "deadline": "ASAP",
    "employer": "JobPortal",
    "jobTitle": "Software Developer",
    "contact": "Subin",
    "jobdescription": [
      {
        "header": "What we offer",
        "description": "attactive salary"
      },
      {
        "header": "Our Expectations",
        "description": "Atleast 3 yr experiance in java"
      }
    ]
  }
  
  URLS
  
  POST : http://localhost:8080/jobs/
  GET by user: http://localhost:8080/jobs/{user}
  GET all jobs : http://localhost:8080/jobs
  PUT:http://localhost:8080/jobs
  DELETE: http://localhost:8080/jobs/{id}
