# College-Enquiry-Chatbot

A lightweight College Enquiry Chatbot (FAQ-based) built as a final-year mini project for the AI & ML branch.
This repo contains a starter prototype (Python + simple FAQ retriever) and instructions to run and extend it.

## Features (v0)
- Local FAQ knowledge base (CSV)
- Simple FAQ matching bot (console)
- Starter code for adding semantic retrieval and web UI

## Quick start
1. Clone the repo:
   `git clone https://github.com/<your-username>/college-enquiry-chatbot.git`
2. Create and activate venv:
   `python -m venv venv && source venv/bin/activate` (mac/linux)  
   `venv\Scripts\activate` (Windows)
3. Install dependencies:
   `pip install -r requirements.txt`
4. Run:
   `python src/simple_faq_bot.py`

## Project structure

## How to contribute
- Create a feature branch: `git checkout -b feature/your-feature`
- Commit and push, then open a pull request.

## License
This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

## Contact
suhasiniraju — livejade1024@gmail.com
# Python
**/venv/
__pycache__/
*.pyc
*.pyo
*.pyd

# IDEs and OS
.vscode/
.idea/
.DS_Store
Thumbs.db

# Env & secrets
.env
.env.* 
*.key

# Data and outputs (optional: remove if you intentionally want data in repo)
data/*.db
data/*.npy
data/*.npz
*.sqlite
*.sqlite3

# Logs
*.log

# Jupyter
.ipynb_checkpoints

# Coverage
.coverage
htmlcov/

# Build
dist/
build/
*.egg-info/
