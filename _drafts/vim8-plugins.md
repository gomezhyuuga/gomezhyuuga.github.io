---
layout: post
title: Install and manage plugins in Vim 8
date: 2017-10-11
tags: [vim, vim-plugins]
---
**Vim 8.0** arrived with new features and one of them is an improved *native plugin system*. Previously, you would use some tools like Pathogen or Plug to manage and install new plugins, but let me show you how to use vanilla vim to do the same tasks.

First of all, you must have the latest version of **Vim 8.0+**. You can check it by running the following command:

{% highlight bash %}
~ ❯ vim --version
VIM - Vi IMproved 8.0 (2016 Sep 12, compiled Oct  5 2017 19:19:02)
MacOS X (unix) version
Included patches: 1-1175
Compiled by Homebrew
Huge version without GUI.  Features included (+) or not (-):
+acl             +file_in_path    +mouse_sgr       +tag_old_static
+arabic          +find_in_path    -mouse_sysmouse  -tag_any_white
+autocmd         +float           +mouse_urxvt     -tcl
-balloon_eval    +folding         +mouse_xterm     +termguicolors
-browse          -footer          +multi_byte      +terminal
...
{% endhighlight %}

Once you checked you have the right version then you are ready to go.

## Setting up a repo of plugins
By default vim would load any plugin installed in the directory **`~/.vim/pack/<foobar>/start/`**. Where `<foobar>` is a **package** that can contain many plugins installed on the subdir `start`.
For me it is easier to have a **git repo** and then **clone** the plugins I want as **git submodules** so I could manage them more easily. Let's do that:
1. Create a directory where you are going to create your repo, e.g. `~/.vim-plugins` and navigate to it:
{% highlight bash %}
mkdir -p $HOME/.vim-plugins/start
cd $HOME/.vim-plugins/start
{% endhighlight %}
2. Create a new git repo:
```
git init .
```

3. Link your repo to the pack directory:
{% highlight bash %}
mkdir -p $HOME/.vim/pack/
ln -s $HOME/.vim-plugins $HOME/.vim/pack/default
{% endhighlight %}
And then you are ready to clone the plugins you want to install.

## Install a plugin
Let say we want to install the **NERDTree plugin**. To do so we just have to **init a submodule** in our repo like this:
```
git submodule add https://github.com/scrooloose/nerdtree.git
```

Restart your vim application and then you would be able to use that plugin.
IMAGE
## Load help files
Although plugins work out of the box, the documentation of each package is not loaded. To do it you need to run inside vim:
```
:helptags ALL
```

## Disable a plugin
Do you rembember the structure of the folder package? It was something like: `<package_name>/start`. The thing here is that vim will autoload the plugins in that directory, but there is another special directory where you can put plugins: `<package_name>/opt`. Those plugins will not be autoloaded but vim will recognize them and keep them as *load on demand*.

So, in order to disable a plugin you can 1) delete the folder of the plugin or 2) move the folder to the `opt/` directory. If you are using the git submodules you can do it by running this:
{% highlight start %}
mkdir opt/
git mv start/nerdtree opt/nerdtree
{% endhighlight %}

## Wrap-up
It could be so tedius to install plugins in this way, but it is another method without depending on any external package.
