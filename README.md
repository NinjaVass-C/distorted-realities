# distorted-realities

Start of full-stack website for an open-source story known as distorted realities. Follows a similar principle to other projects like the SCP Foundation, relying on users contributing to one larger narrative.

## Tech Stack
- Database: MySQL  
- Back-End: Java Spring Boot  
- Front-End: React + Tailwind  

## Proposed Features for MVP
- User-managed website: contributors, moderators, and admins  
- All three are able to create entries; contributor entries must be reviewed by moderators and admins based on guidelines proposed by admins.  
- Approval allows entries to be publicly displayed; index page based off title as well as search bar, or through profile.  
- Declination can include review messages to explain why entries were rejected; progress saved.  
- Save private drafts to profile to work on.  
- Site is hosted on a public server for users to access; CI/CD pipeline created to contribute to project after initial deployment.  
- Unit testing with seeder data that is not present on the hosted site to ensure the application is correctly functioning.  

## Purpose
To create a flagship full-stack project that can be shown off to potential employers, develop real-world system design skills, and have an outlet for creative writing.

## Future Plans after MVP:
TBD

## Outline for Project MVP
- Design database based off MVP that can be easily expanded for future enhancements.  
- Design page layouts for UI needed for MVP; URLs needed for backend API.  
- Design consistent Git conventions for commit messages, PRs, MRs, etc.  
- Research deployment, how it works, hosting providers for DB, frontend, backend.  
- Create database.  
- Begin creating backend APIs, focusing on Test-Driven Development for practice.  
- Integrate login/signups for backend.  
- Focus on getting login/signup page working on front-end.  
- Create front-end; integrate front-end testing where applicable (potentially using Playwright).  
- Once project is created, integrate tests into CI/CD pipeline; deploy everything to server.  

## Timeframe for Project
Ideally done before April 2026 prior to graduation; goal to shoot for is ~3 months.

## Collaboration
Development on the MVP will be limited to myself; however, for future enhancements, potentially design some user stories and add feature requests through GitHub.  
Use SLC Discord server to help others with contributing to open-source projects, give myself some senior-developer experience with mentoring/code reviews.  
Practicing proper PRs and MRs will be done throughout the project, ensuring if others do work in the codebase, they can easily navigate through history and understand why things are done.  
Documentation will be considered depending on scale.
