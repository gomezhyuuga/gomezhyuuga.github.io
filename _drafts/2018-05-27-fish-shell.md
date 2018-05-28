---
title: "[Fish] powerful shell with autocompletion, syntax highlight and more"
categories: fish-shell
date: 2018-05-27
excerpt_separator: <!--more-->
---

<figure>
<script src="https://asciinema.org/a/183906.js" id="asciicast-183906" async></script>
</figure>

I have been using __zsh__ as my default *shell* for so long but the other day I was boring and I decided to try new tools for my OS; one of them was **Fish Shell**.

> [fish](https://fishshell.com/) is a smart and user-friendly command line shell for macOS, Linux, and the rest of the family.

<!--more-->

I'm very picky with visual styles so I was immediately in love with the **syntax highlight** feature. It is enabled by default and, as you can see in the GIF, the highlight works as you type, even in the prompt 💯❗️

## macOS Installation
You can easily install fish using [Homebrew]({{ site.baseurl }}{% post_url 2017-10-01-homebrew %}), just execute the following in the terminal:
```bash
$ brew install fish
```
Then, change your default shell with:
```bash
$ chsh -s /usr/local/bin/fish
```
You may want to know what shell do you have in order to revert the changes if you don't like fish. Execute: `echo $SHELL` and save the output.

## Return to your previous shell
If you were using Bash, then execute:
```bash
$ chsh -s /bin/bash
```
Or if you saved the path of your previous shell using `echo $SHELL` then, use that path.

## Differences between Bash and Fish
### Export variables. Use: `set -x VARIABLE VALUE`

```bash
# e.g. Bash
$ export ANSWER="42"
# e.g. Fish Shell
$ set -x ANSWER "42"
$ echo $ANSWER
42
```

### Command substitution. Use parentheses: `(cmd)`
```bash
$ echo The answer is $ANSWER, (whoami) :)
The answer is 42, gomezhyuuga :)
# Commands are not expaneded inside quotes. However, variables are expanded.
$ echo "The answer is $ANSWER, (whoami) :)"
The answer is 42, (whoami) :)
# Close and reopen quotes instead
$ echo "The answer is $ANSWER, "(whoami)" :)"
The answer is 42, gomezhyuuga :)
```

### $PATH environment variable edition
I would say that modifying the **`PATH`** *env. variable* is a task that many developers have to do quite often. However we can't do it like we are used to because Fish has a special [data structure called ***lists***](https://fishshell.com/docs/current/tutorial.html#tut_lists) and `$PATH` is usually a variable of this type.

In Fish, to append a value to the `$PATH` variable you must do it like this:
```shell
# e.g. set PATH $PATH new_value
$ echo $PATH
/bin /usr/local/bin /usr/bin /bin /usr/sbin /sbin

$ set PATH $PATH ~/Development/master/
$ echo $PATH
/bin /usr/local/bin /usr/bin /bin /usr/sbin /sbin /Users/gomezhyuuga/Development/master/
```
As you can see **`/Users/gomezhyuuga/Development/master`** is appended to the end of the list and if you're clever you will notice that we are just redefining the PATH variable setting as new value to itself, plus a new value appended.


### && combiner. Use: `and`
In Bash, It's common to concatenate commands using the double ampersand `&&` to continue executing things if the previous command exited successfully. In fish you should use `and` instead of the double ampersand.
```bash
$ echo "Current exchange:"; and true; and \
     curl "https://exchangeratesapi.io/api/latest?symbols=USD,MXN&base=USD"; and \
     echo -e "\nDone."
Current exchange:
{"base":"USD","date":"2018-05-25","rates":{"USD":1.0,"MXN":19.6045396146}}
Done.
$ echo "Current exchange:"; and false; and \
     curl "https://exchangeratesapi.io/api/latest?symbols=USD,MXN&base=USD"; and \
     echo -e "\nDone."
Current exchange:
```

## (Web) Configuration

{% include image.html img="fish_config.png" alt="Fish Web Configuration" %}

To edit fish's configuration you can edit the file located at  **`$HOME/.config/fish/config.fish`** and put any shell code inside it.
But what is more exciting is that Fish includes a __web configuration ui__. To access it you must run:
```
$ fish_config
```
It will open a web browser with a location like **`localhost:8000/*`**
There you can edit many things, among them select the **color scheme and even create a custom prompt!**


# Conclusion
Fish is a great tool as a shell. The feature I love the most is the *eager syntax highlighting* and also the *abbreviations* (for which I'll write about them later). I also find it more easy to customize than Bash or ZSH but it is true that there are just few color schemes for it available online. Nevertheless, I've using Fish for a while and it just improved my workflow on the console. **It is totally worth a try.**