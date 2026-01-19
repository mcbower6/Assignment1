# Git Task 2

This is a project to practice git using a number guessing program

## Purpose

Use this project to practice:
- Work with feature branches
- Update them from dev using merge or rebase
- Handle conflicts
- Continue development
- Squash commits
- Merge into dev
- Cherry-pick hotfixes

## Project Structure

- `Main.java` - contains the entry point for the number guessing game
- `GameEngine.java` - contains the logic for the number guessing game
- `GameUI.java` - contains the UI for the number guessing game
- `Utils.java` - contains the mechanic for determining correct guess
- `GuessResult.java` - contains the logic for guessing the random number

## Changes
- feature1 added the ability to quit the game and improved user functionality
- feature2 added additional logic for max attempts and game over
- feature3 added hint mechanics and changed UI implementation

## Learning Summary
- Merge combines one branch with another, this works well with collaboration becuase the history is perserved
- Rebase combines the commits from one branch to another, this one creates a linear history
- Squash condenses multiple commits into a single commit
- Cherry-Pick allows you to apply specific commits from one branch to another

- Each feature branch was used to implement a different idea into the main program without interfering with one another. This helped to ensure that each feature worked independently of the others, with is helpful when merging becuase you know if something is no longer working something went wrong in the merge.

- Each of the above strategies are important and useful in a team setting. Merge is a great way to work in collaboration with another developer(s). This way all developers can work independently and when they are done with their tasks, they can share it with the team. Rebasing is important to make sure everything stays up to date with the changes made by other team members. Squash is helpful because it can help clean up a messy commit history, for example several in progross commits can be condense into a final commit when all the work is done. Cherry-pick is useful because you can pick imporant commits that need to be moved and don't have to waste your time rebasing the entire branch.

- Added comment: Something I had to find out about this was how to switch the credentials for the GitHub my computer was synched to. That was interesting. 
