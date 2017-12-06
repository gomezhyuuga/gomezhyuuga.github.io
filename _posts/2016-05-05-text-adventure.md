---
layout: portfolio
title: Text Adventure Game
link: https://github.com/gomezhyuuga/Text-Adventure-Game
categories: portfolio development
permalink: text-adventure
date: 2016-05-05
thumbs: 6
tools: [ oct-ruby ]
---

<iframe src="https://player.vimeo.com/video/246042474" width="640" height="491" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
<p><a href="https://vimeo.com/246042474">Text Adventure Game</a> from <a href="https://vimeo.com/user45514582">Fernando G&oacute;mez Herrera</a> on <a href="https://vimeo.com">Vimeo</a>.</p>

This is a Ruby web application that allows playing the
revised and improved version of “Werewolves and Wanderer”
text adventure game as explained by Tim Hartnell in the
first 15 chapters of his 1983 book entitled:
[Creating Adventure Games On Your Computer](https://www.atariarchives.org/adventure/).

The game was built using **Sinatra**, **SQLite** and **Javascript**.


## Available commands
### While exploring (not in a fight)
- **`north, south, east, west`**: move to north, south, east or west, respectively.
- **`up, down`**: if there is any stair, move upstairs or downstairs, respectively.
- **`tally`**: get the *stats* so far, including how many monsters have you killed, food amount, life points and your strength.
- **`consume`**: if you have food, consume `1 unit`.
- **`pick_up`**: if there is a treasure in the room, pick it up.
- **`magic`**: use a magic power to move to another random room.

### Fighting
- **`fight`**: choose to fight a monster if it is present in the room.
- **`run`**: run from the monster if you don't want to fight. You have to choose where to run (north, south, east, west).


### Credits
Developed with the help of Luis E. Ballinas.

