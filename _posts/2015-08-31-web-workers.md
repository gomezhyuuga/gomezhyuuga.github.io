---
layout: portfolio
title: Beastly Coprimes
link: https://gomezhyuuga.github.io/web-workers/
categories: portfolio development
permalink: beastly-coprimes
date: 2015-08-31
thumbs: 0
thumbnail: "thumbnail.png"
tools: [dev-html5, dev-javascript_badge]
---
{% include katex.html %}

Example of how to use __[Web Workers][WebWorkers]__
on the browser and take advantage of parallel computing.
For the sake of demonstration, a simple algorithm to compute [coprime numbers][Coprime] is presented. Specifically,
we need to find all coprime numbers from 1 to 1x10^6 such that added together sum __[the number of the beast (666)][BeastPrimes]__.

To compute the coprime numbers, I use an algorithm called [Euclid's algorithm][Euclids]. For each number $$1 \leq i \leq 1x10^8$$,
the evaluation of $$GCD(i, 666) == 1$$ is done and if it holds, such number $$i$$ is added to the final result.

{: .table .is-bordered .is-striped }
|    # Run     | Sequential Time ($$T_1$$) | Parallel Time ($$T_8$$)
-|-|-
| 1 |	6.80 |	1.26
| 2 |	6.88 |	1.23
| 3 |	6.74 |	1.22
| 4 |	6.81 |	1.25
| 5 |	6.83 |	1.25
| __Mean__ |          __6.81__          |         __1.24__

$$
S_8 = \frac{T_1}{T_8} = \frac{6.81}{ 1.24 } = 5.49
$$

$$T_x$$ means the runtime by executing the code using $$x$$ threads.
{: .notification .is-info }

As you can see, there is a great improvement on the execution time. The _parallel_ version works
almost __5.5x__ times faster than the _sequential_ version.

<figure class="image">
    <img class="border" src="{{ "/assets/img/projects/beastly-coprimes/screencast.gif" | relative_url }}" alt="Screencast" />
    <figcaption>
        <a href="http://recordit.co/ZNkSmToEpz">
            <span class='icon'><i class='nf nf-fa-video_camera'></i></span>
            Screencast
        </a>
    </figcaption>
</figure>


<a href="https://github.com/gomezhyuuga/web-workers">
    <span class='icon'><i class='nf nf-fa-external_link_square'></i></span>
    Github Code
</a>


[WebWorkers]: https://developer.mozilla.org/es/docs/Web/API/Web_Workers_API
[Coprime]: https://en.wikipedia.org/wiki/Coprime_integers
[Euclids]: https://en.wikipedia.org/wiki/Euclidean_algorithm
[BeastPrimes]: https://primes.utm.edu/curios/page.php/666.html
