   ## About The Project
   

**FocusMate AI** is a mobile-first ADHD assistant app that helps users **stay focused, manage tasks, and feel supported**.  
It combines **React Native** for the mobile app, **Java Quarkus** for the backend, and **AI** for personalized task management and coaching.  
An optional **AR Focus Buddy** feature adds a fun, visual motivation element using ARKit/ARCore.

### Why This Project Exists
Millions of people with ADHD struggle daily with task initiation, organization, and sustained focus.  
Generic task apps fail because they don't adapt to ADHD-specific needs. FocusMate AI solves this by:
- Breaking tasks into ADHD-friendly micro-steps.
- Offering a friendly AI focus coach.
- Adjusting reminders to user habits.
- Adding fun AR motivation.

---

### Core Features
1. **Smart Task Management**
   - AI breaks big tasks into small, doable steps.
   - Stored and synced via Quarkus backend.
2. **AI Focus Coach**
   - Chat-based encouragement and focus tips.
   - Powered by OpenAI API integration in Quarkus.
3. **Adaptive Reminders**
   - AI optimizes timing and style of reminders based on user habits.
4. **Mood & Energy Check-ins**
   - Tracks daily well-being and correlates with productivity.
5. **AR Focus Buddy** *(optional)*
   - 3D character that appears via AR to motivate and celebrate completed tasks.

---

### Tech Stack
**Frontend:**
- React Native (cross-platform mobile app)
- React Native ARKit / ARCore

**Backend:**
- Java Quarkus (REST API)
- PostgreSQL for persistence
- OpenAI API for AI features
- Firebase Cloud Messaging for notifications

**Architecture:**
- **API Endpoints** in Quarkus:
  - `POST /tasks` – create task, optional AI breakdown
  - `GET /tasks` – fetch tasks
  - `POST /coach/message` – send message to AI coach
  - `GET /reminders` – retrieve optimized reminder times
- **Auth:** JWT-based authentication
- **Deployment:** Dockerized Quarkus app → Kubernetes/GCP/AWS

---

<p align="right">(<a href="#readme-top">back to top</a>)</p>
