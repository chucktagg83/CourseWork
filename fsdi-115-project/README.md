# Steps to link a project to Github Repo

    1. Create the folder on our computer (The space to work on the project)
    2. Go to github.com and create a new repo (Just add a repo name and leave the rest by default)
    3. On the terminal (make sure that you are on the right directory):

        First time execution
        - Execute: git init (to initialize a new page)
        - Execute: git add -A
        - Execute: git commit -m "YOUR_MESSAGE"
        - Execute: git branch -M main
        - Execute: git remote add origin git@github.com:GIT_USER/REPO_NAME.git
        - Execute: git push -u origin main

        ** Regular workflow when repo is connected **
        - Execute: git add -A
        - Execute: git commit -m "YOUR_MESSAGE"
        - Execute: git push -u origin main