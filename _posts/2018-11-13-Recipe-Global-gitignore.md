---
title: "[Recipe] Use a global .gitignore file"
categories: Recipes
tags: Git
---

If you want to use a *global* **.gitignore** file shared by all your Git projects, just follow the next steps.

1. Create the file, e.g. at your ***dotfiles* directory:**
```bash
$ touch ~/.dotfiles/gitignore
```
2. Fill it with whatever you want:
```bash
❯ cat ~/.dotfiles/gitignore
.DS_Store
.vscode/
*.log
node_modules/
```
3. Set Git’s option **core.excludesfile** to the path of the previous file:
```bash
$ git config --global core.excludesfile ~/.dotfiles/gitignore
```

**Done.**


You can change the `~/.dotfiles/gitignore` path to wherever you have your global **.gitignore** file.