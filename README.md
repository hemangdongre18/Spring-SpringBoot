Step 1: Initialize Git locally

Since Git is not set up yet:

git init

Step 2: Add GitHub repository as remote

Go to GitHub → your repository → copy the HTTPS or SSH URL.

Then run:

git remote add origin <YOUR_GITHUB_REPO_URL>


Verify:

git remote -v

Step 3: Create and switch to the new branch (IMPORTANT)

You do NOT want to work on main, so create your branch first:

git checkout -b RequestBody-and-PathVariable


This ensures all commits go only to this branch.

Step 4: Add all project files
git add .


Check what’s being added:

git status

Step 5: Commit your project
git commit -m "Initial project setup with RequestBody and PathVariable"

Step 6: Push the branch to GitHub
git push -u origin RequestBody-and-PathVariable


This:

Creates the branch on GitHub

Links your local branch to the remote one
