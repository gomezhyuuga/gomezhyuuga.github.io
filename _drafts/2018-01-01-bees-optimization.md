---
title: Bee System Optimization
categories: science
---








<!-- Custom stylesheet, it must be in the same directory as the html file -->
  <div tabindex="-1" id="notebook" class="border-box-sizing">
    <div class="container" id="notebook-container">

<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[1]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="kn">from</span> <span class="nn">random</span> <span class="k">import</span> <span class="n">uniform</span>
<span class="kn">from</span> <span class="nn">bokeh.plotting</span> <span class="k">import</span> <span class="n">figure</span><span class="p">,</span> <span class="n">output_notebook</span><span class="p">,</span> <span class="n">show</span>
<span class="kn">from</span> <span class="nn">bokeh.io</span> <span class="k">import</span> <span class="n">output_notebook</span><span class="p">,</span> <span class="n">show</span>
<span class="kn">from</span> <span class="nn">numpy</span> <span class="k">import</span> <span class="n">pi</span><span class="p">,</span> <span class="n">arange</span><span class="p">,</span> <span class="n">sin</span><span class="p">,</span> <span class="n">linspace</span>

<span class="n">output_notebook</span><span class="p">()</span>
<span class="k">def</span> <span class="nf">render_fn</span><span class="p">():</span>
    <span class="n">x</span> <span class="o">=</span> <span class="n">linspace</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="mi">15</span><span class="p">,</span> <span class="mi">100</span><span class="p">)</span>
    <span class="n">y</span> <span class="o">=</span> <span class="n">x</span><span class="o">*</span><span class="n">sin</span><span class="p">(</span><span class="n">x</span><span class="p">)</span><span class="o">/</span><span class="mi">2</span> <span class="o">+</span> <span class="mi">10</span>
    <span class="n">y2</span> <span class="o">=</span> <span class="n">linspace</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="mi">100</span><span class="p">,</span> <span class="nb">len</span><span class="p">(</span><span class="n">y</span><span class="p">))</span>

    <span class="n">p</span> <span class="o">=</span> <span class="n">figure</span><span class="p">(</span><span class="n">x_range</span><span class="o">=</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="mi">16</span><span class="p">))</span>
    <span class="n">p</span><span class="o">.</span><span class="n">line</span><span class="p">(</span><span class="n">x</span><span class="p">,</span> <span class="n">y</span><span class="p">)</span>

    <span class="k">return</span> <span class="n">p</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

<div class="prompt"></div>



<div class="output_html rendered_html output_subarea ">

    <div class="bk-root">
        <a href="https://bokeh.pydata.org" target="_blank" class="bk-logo bk-logo-small bk-logo-notebook"></a>
        <span id="04c91fbd-2cd4-4741-b70c-0de3cf2c61bd">Loading BokehJS ...</span>
    </div>
</div>

</div>

<div class="output_area">

<div class="prompt"></div>





<div id="eb404299-c15a-4461-a319-7f0ca9761b56"></div>
<div class="output_subarea output_javascript ">
<script type="text/javascript">
var element = $('#eb404299-c15a-4461-a319-7f0ca9761b56');

(function(root) {
  function now() {
    return new Date();
  }

  var force = true;

  if (typeof (root._bokeh_onload_callbacks) === "undefined" || force === true) {
    root._bokeh_onload_callbacks = [];
    root._bokeh_is_loading = undefined;
  }


  
  if (typeof (root._bokeh_timeout) === "undefined" || force === true) {
    root._bokeh_timeout = Date.now() + 5000;
    root._bokeh_failed_load = false;
  }

  var NB_LOAD_WARNING = {'data': {'text/html':
     "<div style='background-color: #fdd'>\n"+
     "<p>\n"+
     "BokehJS does not appear to have successfully loaded. If loading BokehJS from CDN, this \n"+
     "may be due to a slow or bad network connection. Possible fixes:\n"+
     "</p>\n"+
     "<ul>\n"+
     "<li>re-rerun `output_notebook()` to attempt to load from CDN again, or</li>\n"+
     "<li>use INLINE resources instead, as so:</li>\n"+
     "</ul>\n"+
     "<code>\n"+
     "from bokeh.resources import INLINE\n"+
     "output_notebook(resources=INLINE)\n"+
     "</code>\n"+
     "</div>"}};

  function display_loaded() {
    if (root.Bokeh !== undefined) {
      var el = document.getElementById("04c91fbd-2cd4-4741-b70c-0de3cf2c61bd");
      if (el != null) {
        el.textContent = "BokehJS " + Bokeh.version + " successfully loaded.";
      }
    } else if (Date.now() < root._bokeh_timeout) {
      setTimeout(display_loaded, 100)
    }
  }


  function run_callbacks() {
    try {
      root._bokeh_onload_callbacks.forEach(function(callback) { callback() });
    }
    finally {
      delete root._bokeh_onload_callbacks
    }
    console.info("Bokeh: all callbacks have finished");
  }

  function load_libs(js_urls, callback) {
    root._bokeh_onload_callbacks.push(callback);
    if (root._bokeh_is_loading > 0) {
      console.log("Bokeh: BokehJS is being loaded, scheduling callback at", now());
      return null;
    }
    if (js_urls == null || js_urls.length === 0) {
      run_callbacks();
      return null;
    }
    console.log("Bokeh: BokehJS not loaded, scheduling load and callback at", now());
    root._bokeh_is_loading = js_urls.length;
    for (var i = 0; i < js_urls.length; i++) {
      var url = js_urls[i];
      var s = document.createElement('script');
      s.src = url;
      s.async = false;
      s.onreadystatechange = s.onload = function() {
        root._bokeh_is_loading--;
        if (root._bokeh_is_loading === 0) {
          console.log("Bokeh: all BokehJS libraries loaded");
          run_callbacks()
        }
      };
      s.onerror = function() {
        console.warn("failed to load library " + url);
      };
      console.log("Bokeh: injecting script tag for BokehJS library: ", url);
      document.getElementsByTagName("head")[0].appendChild(s);
    }
  };var element = document.getElementById("04c91fbd-2cd4-4741-b70c-0de3cf2c61bd");
  if (element == null) {
    console.log("Bokeh: ERROR: autoload.js configured with elementid '04c91fbd-2cd4-4741-b70c-0de3cf2c61bd' but no matching script tag was found. ")
    return false;
  }

  var js_urls = ["https://cdn.pydata.org/bokeh/release/bokeh-0.12.7.min.js", "https://cdn.pydata.org/bokeh/release/bokeh-widgets-0.12.7.min.js", "https://cdn.pydata.org/bokeh/release/bokeh-tables-0.12.7.min.js", "https://cdn.pydata.org/bokeh/release/bokeh-gl-0.12.7.min.js"];

  var inline_js = [
    function(Bokeh) {
      Bokeh.set_log_level("info");
    },
    
    function(Bokeh) {
      
    },
    
    function(Bokeh) {
      
      document.getElementById("04c91fbd-2cd4-4741-b70c-0de3cf2c61bd").textContent = "BokehJS is loading...";
    },
    function(Bokeh) {
      console.log("Bokeh: injecting CSS: https://cdn.pydata.org/bokeh/release/bokeh-0.12.7.min.css");
      Bokeh.embed.inject_css("https://cdn.pydata.org/bokeh/release/bokeh-0.12.7.min.css");
      console.log("Bokeh: injecting CSS: https://cdn.pydata.org/bokeh/release/bokeh-widgets-0.12.7.min.css");
      Bokeh.embed.inject_css("https://cdn.pydata.org/bokeh/release/bokeh-widgets-0.12.7.min.css");
      console.log("Bokeh: injecting CSS: https://cdn.pydata.org/bokeh/release/bokeh-tables-0.12.7.min.css");
      Bokeh.embed.inject_css("https://cdn.pydata.org/bokeh/release/bokeh-tables-0.12.7.min.css");
    }
  ];

  function run_inline_js() {
    
    if ((root.Bokeh !== undefined) || (force === true)) {
      for (var i = 0; i < inline_js.length; i++) {
        inline_js[i].call(root, root.Bokeh);
      }if (force === true) {
        display_loaded();
      }} else if (Date.now() < root._bokeh_timeout) {
      setTimeout(run_inline_js, 100);
    } else if (!root._bokeh_failed_load) {
      console.log("Bokeh: BokehJS failed to load within specified timeout.");
      root._bokeh_failed_load = true;
    } else if (force !== true) {
      var cell = $(document.getElementById("04c91fbd-2cd4-4741-b70c-0de3cf2c61bd")).parents('.cell').data().cell;
      cell.output_area.append_execute_result(NB_LOAD_WARNING)
    }

  }

  if (root._bokeh_is_loading === 0) {
    console.log("Bokeh: BokehJS loaded, going straight to plotting");
    run_inline_js();
  } else {
    load_libs(js_urls, function() {
      console.log("Bokeh: BokehJS plotting callback run at", now());
      run_inline_js();
    });
  }
}(window));
</script>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h1 id="Exercise-8:-Metaheuristics">Exercise 8: Metaheuristics<a class="anchor-link" href="#Exercise-8:-Metaheuristics">&#182;</a></h1><ul>
<li>Run the first complete cycle of a Bees Algorithm trying to MAXIMIZE the non-linear function shown below in the range $[0 \leq x \leq 15]$. The cycle ends when the remaining bees for random search (scout bees) are assigned.</li>
<li>Simulate a BA with $n = 7$ bees and show the selected value for each remaining parameter of the method.</li>
<li>Based on the example of the slides seen in class, show each required pseudorandom number, each performed calculation, and the effect of each step of the method (include an illustration).</li>
</ul>
<p>The function we want to <strong>maximize</strong> is:
$
    f(x) = x \frac{sin(x)}{2} + 10
$</p>
<p><img src="attachment:image.png" alt="image.png"></p>
<p>We clearly see many local optimal and the <strong>global optimal</strong> (in the domain we chose) is: <strong><code>(14.207, 17.086)</code></strong>.</p>
<h2 id="Parameters">Parameters<a class="anchor-link" href="#Parameters">&#182;</a></h2><ul>
<li>Population size (total of scout bees): <strong><code>n = 7</code></strong></li>
<li>Number of selected sites (m) of the n visited: <strong><code>m = 4</code></strong></li>
<li>Number of the best sites (e) of the m selected: <strong><code>e = 2</code></strong></li>
<li>Number of bees recruited for e best sites (nos or n2): <strong><code>nos = 2</code></strong></li>
<li>Number of bees recruited for other (m-e) selected sites (nsp or n1): <strong><code>nsp = 1</code></strong></li>
<li>Initial size of patches (ngh) including site, neighborhood, and unemployment criteria: <strong><code>ngh = 3</code></strong></li>
<li>Maximum number of algorithm iterations (imax)</li>
</ul>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[35]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">fn</span> <span class="o">=</span> <span class="k">lambda</span> <span class="n">x</span><span class="p">:</span> <span class="n">x</span> <span class="o">*</span> <span class="p">(</span><span class="n">sin</span><span class="p">(</span><span class="n">x</span><span class="p">)</span> <span class="o">/</span> <span class="mi">2</span><span class="p">)</span> <span class="o">+</span> <span class="mi">10</span>
<span class="n">DELTA</span> <span class="o">=</span> <span class="mf">0.3</span>
<span class="n">n</span> <span class="o">=</span> <span class="mi">7</span>
<span class="n">m</span> <span class="o">=</span> <span class="mi">4</span>
<span class="n">e</span> <span class="o">=</span> <span class="mi">2</span>
<span class="n">nos</span> <span class="o">=</span> <span class="mi">2</span>
<span class="n">nsp</span> <span class="o">=</span> <span class="mi">1</span>
<span class="n">ngh</span> <span class="o">=</span> <span class="mi">3</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="1.-Initialize-the-population-with-a-random-search:"><strong>1. Initialize the population with a random search:</strong><a class="anchor-link" href="#1.-Initialize-the-population-with-a-random-search:">&#182;</a></h2>
</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[12]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="c1"># Initializing the values of the bees inside the domain</span>
<span class="k">def</span> <span class="nf">gen_num</span><span class="p">():</span>
    <span class="n">rnd</span> <span class="o">=</span> <span class="n">uniform</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="mi">15</span><span class="p">)</span>
    <span class="k">return</span> <span class="p">(</span><span class="n">rnd</span><span class="p">,</span> <span class="n">fn</span><span class="p">(</span><span class="n">rnd</span><span class="p">))</span>
<span class="n">bees</span> <span class="o">=</span> <span class="p">[</span><span class="n">gen_num</span><span class="p">()</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="nb">range</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="n">n</span><span class="p">)]</span>
<span class="n">bees</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

<div class="prompt output_prompt">Out[12]:</div>




<div class="output_text output_subarea output_execute_result">
<pre>[(4.011522255268952, 8.46702978412387),
 (4.313861256667773, 8.01210084902816),
 (3.7731409377787117, 8.8861780251878351),
 (7.1597017814017, 12.751167942089456),
 (8.326757729246062, 13.706687839899422),
 (11.667870264321984, 5.4355651375941845),
 (10.620925151598048, 5.0578919441042105)]</pre>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="2.-Select-the-best-sites-for-a-neighborhood">2. Select the best sites for a neighborhood<a class="anchor-link" href="#2.-Select-the-best-sites-for-a-neighborhood">&#182;</a></h2><p>With the parameters <strong><code>m = 4</code></strong> and <strong><code>e = 2</code></strong> elite bees.</p>
<ul>
<li><strong>RED</strong> circles are the <em>elite</em> bees.</li>
<li><strong>YELLOW</strong> circles represent the best <strong><code>m-e</code></strong> bees.</li>
<li><strong>BLUE</strong> circles are the rest of the bees.</li>
</ul>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[13]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">p</span> <span class="o">=</span> <span class="n">render_fn</span><span class="p">()</span>
<span class="n">bees</span> <span class="o">=</span> <span class="nb">sorted</span><span class="p">(</span><span class="n">bees</span><span class="p">,</span> <span class="n">key</span><span class="o">=</span><span class="k">lambda</span> <span class="n">x</span><span class="p">:</span> <span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">],</span> <span class="n">reverse</span><span class="o">=</span><span class="kc">True</span><span class="p">)</span>
<span class="n">best_m</span> <span class="o">=</span> <span class="n">bees</span><span class="p">[</span><span class="mi">0</span><span class="p">:</span><span class="n">m</span><span class="p">]</span>
<span class="n">elites</span> <span class="o">=</span> <span class="n">best_m</span><span class="p">[</span><span class="mi">0</span><span class="p">:</span><span class="n">e</span><span class="p">]</span>

<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">bees</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">bees</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span>  <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">best_m</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">best_m</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="s2">&quot;yellow&quot;</span><span class="p">,</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">elites</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">elites</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="s2">&quot;red&quot;</span><span class="p">,</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">show</span><span class="p">(</span><span class="n">p</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

<div class="prompt"></div>



<div class="output_html rendered_html output_subarea ">


    <div class="bk-root">
        <div class="bk-plotdiv" id="d96f7c25-3585-4475-b0ad-20fa3bb54502"></div>
    </div>
<script type="text/javascript">
  
  (function(root) {
    function now() {
      return new Date();
    }
  
    var force = false;
  
    if (typeof (root._bokeh_onload_callbacks) === "undefined" || force === true) {
      root._bokeh_onload_callbacks = [];
      root._bokeh_is_loading = undefined;
    }
  
  
    
    if (typeof (root._bokeh_timeout) === "undefined" || force === true) {
      root._bokeh_timeout = Date.now() + 0;
      root._bokeh_failed_load = false;
    }
  
    var NB_LOAD_WARNING = {'data': {'text/html':
       "<div style='background-color: #fdd'>\n"+
       "<p>\n"+
       "BokehJS does not appear to have successfully loaded. If loading BokehJS from CDN, this \n"+
       "may be due to a slow or bad network connection. Possible fixes:\n"+
       "</p>\n"+
       "<ul>\n"+
       "<li>re-rerun `output_notebook()` to attempt to load from CDN again, or</li>\n"+
       "<li>use INLINE resources instead, as so:</li>\n"+
       "</ul>\n"+
       "<code>\n"+
       "from bokeh.resources import INLINE\n"+
       "output_notebook(resources=INLINE)\n"+
       "</code>\n"+
       "</div>"}};
  
    function display_loaded() {
      if (root.Bokeh !== undefined) {
        var el = document.getElementById("d96f7c25-3585-4475-b0ad-20fa3bb54502");
        if (el != null) {
          el.textContent = "BokehJS " + Bokeh.version + " successfully loaded.";
        }
      } else if (Date.now() < root._bokeh_timeout) {
        setTimeout(display_loaded, 100)
      }
    }
  
  
    function run_callbacks() {
      try {
        root._bokeh_onload_callbacks.forEach(function(callback) { callback() });
      }
      finally {
        delete root._bokeh_onload_callbacks
      }
      console.info("Bokeh: all callbacks have finished");
    }
  
    function load_libs(js_urls, callback) {
      root._bokeh_onload_callbacks.push(callback);
      if (root._bokeh_is_loading > 0) {
        console.log("Bokeh: BokehJS is being loaded, scheduling callback at", now());
        return null;
      }
      if (js_urls == null || js_urls.length === 0) {
        run_callbacks();
        return null;
      }
      console.log("Bokeh: BokehJS not loaded, scheduling load and callback at", now());
      root._bokeh_is_loading = js_urls.length;
      for (var i = 0; i < js_urls.length; i++) {
        var url = js_urls[i];
        var s = document.createElement('script');
        s.src = url;
        s.async = false;
        s.onreadystatechange = s.onload = function() {
          root._bokeh_is_loading--;
          if (root._bokeh_is_loading === 0) {
            console.log("Bokeh: all BokehJS libraries loaded");
            run_callbacks()
          }
        };
        s.onerror = function() {
          console.warn("failed to load library " + url);
        };
        console.log("Bokeh: injecting script tag for BokehJS library: ", url);
        document.getElementsByTagName("head")[0].appendChild(s);
      }
    };var element = document.getElementById("d96f7c25-3585-4475-b0ad-20fa3bb54502");
    if (element == null) {
      console.log("Bokeh: ERROR: autoload.js configured with elementid 'd96f7c25-3585-4475-b0ad-20fa3bb54502' but no matching script tag was found. ")
      return false;
    }
  
    var js_urls = [];
  
    var inline_js = [
      function(Bokeh) {
        (function() {
          var fn = function() {
            var docs_json = {"1018e1f1-8a72-41dd-aaf2-39b53612694b":{"roots":{"references":[{"attributes":{"source":{"id":"6f5d1e1a-2d2e-4c02-b0b3-7cf9dd74a851","type":"ColumnDataSource"}},"id":"2e033cd6-7a88-4e32-89a4-32d2759161d2","type":"CDSView"},{"attributes":{},"id":"95629057-2c88-42f9-82a1-3cefc1e391ec","type":"PanTool"},{"attributes":{},"id":"985dcead-664e-43c7-8058-9d3ad5149d8a","type":"WheelZoomTool"},{"attributes":{"source":{"id":"b4523c86-eef5-4fcb-aba7-e16722c80995","type":"ColumnDataSource"}},"id":"906dc209-1ec0-4095-aa5a-454b9e06516f","type":"CDSView"},{"attributes":{},"id":"df912a67-e3da-4be5-8f38-cc714644127d","type":"ResetTool"},{"attributes":{},"id":"3339b325-9c16-421f-b821-0b2b91b5ceac","type":"BasicTicker"},{"attributes":{"data_source":{"id":"b4523c86-eef5-4fcb-aba7-e16722c80995","type":"ColumnDataSource"},"glyph":{"id":"6d880824-9bff-4150-902c-bed5a1122cb8","type":"Line"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"2460f70c-be6d-40a9-b368-0d91297b6260","type":"Line"},"selection_glyph":null,"view":{"id":"906dc209-1ec0-4095-aa5a-454b9e06516f","type":"CDSView"}},"id":"45eafa4f-fb17-48d6-b8d3-bbc5e310e74f","type":"GlyphRenderer"},{"attributes":{},"id":"f3ec06ce-9373-456c-b341-9fe106a06ebc","type":"BasicTickFormatter"},{"attributes":{"fill_alpha":{"value":0.1},"fill_color":{"value":"#1f77b4"},"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"362e485a-0b4f-4412-af72-0c7a2a5f3744","type":"Circle"},{"attributes":{"callback":null,"column_names":["x","y"],"data":{"x":{"__ndarray__":"AAAAAAAAAABlk0022WTDP2WTTTbZZNM/GF100UUX3T9lk0022WTjPz744IMPPug/GF100UUX7T/44IMPPvjwP2WTTTbZZPM/0kUXXXTR9T8++OCDDz74P6uqqqqqqvo/GF100UUX/T+EDz744IP/P/jggw8++ABAL7rooosuAkBlk0022WQDQJtssskmmwRA0kUXXXTRBUAIH3zwwQcHQD744IMPPghAddFFF110CUCrqqqqqqoKQOGDDz744AtAGF100UUXDUBONtlkk00OQIQPPvjggw9AXXTRRRddEED44IMPPvgQQJRNNtlkkxFAL7rooosuEkDKJptssskSQGWTTTbZZBNAAAAAAAAAFECbbLLJJpsUQDbZZJNNNhVA0kUXXXTRFUBtsskmm2wWQAgffPDBBxdAo4suuuiiF0A++OCDDz4YQNlkk0022RhAddFFF110GUAQPvjggw8aQKuqqqqqqhpARhdddNFFG0Dhgw8++OAbQHzwwQcffBxAGF100UUXHUCzySabbLIdQE422WSTTR5A6aKLLrroHkCEDz744IMfQBA++OCDDyBAXXTRRRddIECrqqqqqqogQPjggw8++CBARhdddNFFIUCUTTbZZJMhQOGDDz744CFAL7rooosuIkB88MEHH3wiQMomm2yyySJAF1100UUXI0Blk0022WQjQLPJJptssiNAAAAAAAAAJEBONtlkk00kQJtssskmmyRA6aKLLrroJEA22WSTTTYlQIQPPvjggyVA0kUXXXTRJUAffPDBBx8mQG2yySabbCZAuuiiiy66JkAIH3zwwQcnQFZVVVVVVSdAo4suuuiiJ0DxwQcffPAnQD744IMPPihAjC666KKLKEDZZJNNNtkoQCebbLLJJilAddFFF110KUDCBx988MEpQBA++OCDDypAXXTRRRddKkCrqqqqqqoqQPjggw8++CpARhdddNFFK0CUTTbZZJMrQOGDDz744CtAL7rooosuLEB88MEHH3wsQMomm2yyySxAGF100UUXLUBlk0022WQtQLPJJptssi1AAAAAAAAALkA=","dtype":"float64","shape":[100]},"y":{"__ndarray__":"AAAAAAAAJEBBju2/2gUkQOWJOlEmFyRAJ7PABBczJEAvbh8tYVgkQHYfdJBEhSRAWMSs75u3JEC7f4Yp8OwkQHeYiWKOIiVA1XXpgqBVJUDJDdBHR4MlQLbe2xe1qCVAHQ7hwkjDJUAA3pFTp9AlQKDYox7UziVAQts7Rka8JUCIopz5+pclQKiJz8+DYSVAgW6rtxAZJUCQe3sXdb8kQOYTudknViRAlQjaST7fI0BlnRTLYV0jQAkZGJrA0yJAS/T48PlFIkCTBN0IBrghQPYuQ5YaLiFAp8AaeoysIEBrWGF6rzcgQKTb189ppx9Aimp7RxQJH0Ayqtv4b5seQNZdr7aHZB5AINApYydpHkA1lVEMq6weQK9MPePWMB9AdnpHcLn1H0CnCICSzHwgQMOdDhF3HCFALzroWjTXIUBazeZfgqkiQKSrI+cUjyNAgcVFtuuCJEAGSZphbn8lQLQTvyqNfiZAq6LHLOZ5J0BGxFTy7WooQJ0pFXUaSylAsPJvbw8UKkDO1GnZyr8qQJ4ktGHQSCtA2mycs1KqK0DK1WhiWeArQG09gWLi5ytAQjdQEP6+K0BuAI/j5GQrQAEVBhMG2ipAqCDVlw4gKkC1kgov6DkpQGThiyuwKyhAQhfGH6b6JkB5FfmcEq0lQJEFynsmSiRAkF67VdPZIkCHCtIHnmQhQNohfoXY5h9AbO5HppweHUA4tr7XjIIaQHYPo6cdJBhAP8fvzsATFkA0PyLJdWAUQNPQxuRgFxNAUlpMmGtDEkBlD0m58OwRQCdHp/V2GRJAT+zpnnvLEkDj7ZR5TwIUQH5o5dcGuhVAVy/h0X3rF0BAQSTwcIwaQLKSth2qjx1AW0FkmaByIEDdUtx0dz0iQFOsPUo4HiRAv0HIOv0JJkB5+hQcW/UnQK7h4VSl1ClAA9FXxzScK0D2kIUasEAtQLeb96NTty5AD9JELDf2L0BauznnR3owQIWoJiF21TBAe+5u/rQJMUDJy/Xb8BQxQBanQRAF9jBAQIlP0sesMECaSqpLEDowQATbVihtPy9AXetY9RrBLUA=","dtype":"float64","shape":[100]}}},"id":"b4523c86-eef5-4fcb-aba7-e16722c80995","type":"ColumnDataSource"},{"attributes":{"callback":null},"id":"3d0b4d37-afc2-4011-b555-4d59a63ba7be","type":"DataRange1d"},{"attributes":{"plot":{"id":"c4d6a5ef-c058-4474-8780-dbf36aa49a0b","subtype":"Figure","type":"Plot"},"ticker":{"id":"3339b325-9c16-421f-b821-0b2b91b5ceac","type":"BasicTicker"}},"id":"f762e17c-8a43-4603-94ca-501eb49b525c","type":"Grid"},{"attributes":{"plot":null,"text":""},"id":"e79126b3-6225-4239-bd94-237d5c80f6e3","type":"Title"},{"attributes":{"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"x":{"field":"x"},"y":{"field":"y"}},"id":"2460f70c-be6d-40a9-b368-0d91297b6260","type":"Line"},{"attributes":{"below":[{"id":"c16fceeb-1918-4641-9a32-fb660eddeb48","type":"LinearAxis"}],"left":[{"id":"7ade6873-d214-4f84-9544-b5bca82b615c","type":"LinearAxis"}],"renderers":[{"id":"c16fceeb-1918-4641-9a32-fb660eddeb48","type":"LinearAxis"},{"id":"f762e17c-8a43-4603-94ca-501eb49b525c","type":"Grid"},{"id":"7ade6873-d214-4f84-9544-b5bca82b615c","type":"LinearAxis"},{"id":"f8238fd4-4bb9-4a11-8a9e-b2593b48d2e3","type":"Grid"},{"id":"c07ca512-69b2-4d31-86ef-02efc4021f9e","type":"BoxAnnotation"},{"id":"45eafa4f-fb17-48d6-b8d3-bbc5e310e74f","type":"GlyphRenderer"},{"id":"799ef439-2861-497d-8dc6-75211f80e2f3","type":"GlyphRenderer"},{"id":"9c6cb119-4976-48f0-966a-ac59f736c9df","type":"GlyphRenderer"},{"id":"d34711c7-cc9a-4847-9950-f5cda9237ba2","type":"GlyphRenderer"}],"title":{"id":"e79126b3-6225-4239-bd94-237d5c80f6e3","type":"Title"},"toolbar":{"id":"05715d50-8917-4ef5-87c5-ee52928dac74","type":"Toolbar"},"x_range":{"id":"77cf9ad1-7ebd-474c-bddd-b6263120c023","type":"Range1d"},"x_scale":{"id":"e8ce0644-5ae2-4aa7-bda0-7ad08c9b41dd","type":"LinearScale"},"y_range":{"id":"3d0b4d37-afc2-4011-b555-4d59a63ba7be","type":"DataRange1d"},"y_scale":{"id":"4542d0c0-2fa9-460c-b224-5aaaeb40754f","type":"LinearScale"}},"id":"c4d6a5ef-c058-4474-8780-dbf36aa49a0b","subtype":"Figure","type":"Plot"},{"attributes":{"formatter":{"id":"98eb2b07-3ef1-4181-9d9e-c6f6d653e77b","type":"BasicTickFormatter"},"plot":{"id":"c4d6a5ef-c058-4474-8780-dbf36aa49a0b","subtype":"Figure","type":"Plot"},"ticker":{"id":"15d308ae-cba3-4643-836f-7b06d816d7a1","type":"BasicTicker"}},"id":"7ade6873-d214-4f84-9544-b5bca82b615c","type":"LinearAxis"},{"attributes":{},"id":"15d308ae-cba3-4643-836f-7b06d816d7a1","type":"BasicTicker"},{"attributes":{"data_source":{"id":"6f5d1e1a-2d2e-4c02-b0b3-7cf9dd74a851","type":"ColumnDataSource"},"glyph":{"id":"78010d12-5c5c-4ca8-9763-fd03f1df84ea","type":"Circle"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"362e485a-0b4f-4412-af72-0c7a2a5f3744","type":"Circle"},"selection_glyph":null,"view":{"id":"2e033cd6-7a88-4e32-89a4-32d2759161d2","type":"CDSView"}},"id":"d34711c7-cc9a-4847-9950-f5cda9237ba2","type":"GlyphRenderer"},{"attributes":{"line_color":{"value":"#1f77b4"},"x":{"field":"x"},"y":{"field":"y"}},"id":"6d880824-9bff-4150-902c-bed5a1122cb8","type":"Line"},{"attributes":{"dimension":1,"plot":{"id":"c4d6a5ef-c058-4474-8780-dbf36aa49a0b","subtype":"Figure","type":"Plot"},"ticker":{"id":"15d308ae-cba3-4643-836f-7b06d816d7a1","type":"BasicTicker"}},"id":"f8238fd4-4bb9-4a11-8a9e-b2593b48d2e3","type":"Grid"},{"attributes":{},"id":"98eb2b07-3ef1-4181-9d9e-c6f6d653e77b","type":"BasicTickFormatter"},{"attributes":{"data_source":{"id":"5e31a4a8-27d2-430e-93c5-f6d76a2f3112","type":"ColumnDataSource"},"glyph":{"id":"a6690539-58c5-47d3-8202-997f47991fd2","type":"Circle"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"9bd1cf0e-f63c-4754-83ff-a0f71a8d7891","type":"Circle"},"selection_glyph":null,"view":{"id":"223a4f86-a725-404b-a15c-f1319adee36f","type":"CDSView"}},"id":"9c6cb119-4976-48f0-966a-ac59f736c9df","type":"GlyphRenderer"},{"attributes":{"fill_alpha":{"value":0.5},"fill_color":{"value":"red"},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"78010d12-5c5c-4ca8-9763-fd03f1df84ea","type":"Circle"},{"attributes":{"source":{"id":"7d0a5415-fe28-465a-916f-ab83b0eb3b0c","type":"ColumnDataSource"}},"id":"d7bc9735-7b9f-4172-a7cb-66d4438bf92a","type":"CDSView"},{"attributes":{"callback":null,"end":16},"id":"77cf9ad1-7ebd-474c-bddd-b6263120c023","type":"Range1d"},{"attributes":{},"id":"72d780e1-1ff7-4750-aa2a-1ffb62c4b695","type":"SaveTool"},{"attributes":{"callback":null,"column_names":["x","y"],"data":{"x":[8.326757729246062,7.1597017814017,3.7731409377787117,4.011522255268952],"y":[13.706687839899422,12.751167942089456,8.886178025187835,8.46702978412387]}},"id":"5e31a4a8-27d2-430e-93c5-f6d76a2f3112","type":"ColumnDataSource"},{"attributes":{"fill_alpha":{"value":0.1},"fill_color":{"value":"#1f77b4"},"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"9bd1cf0e-f63c-4754-83ff-a0f71a8d7891","type":"Circle"},{"attributes":{"fill_alpha":{"value":0.1},"fill_color":{"value":"#1f77b4"},"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"de3d1bfe-5132-49a3-8d25-c98032903a04","type":"Circle"},{"attributes":{"source":{"id":"5e31a4a8-27d2-430e-93c5-f6d76a2f3112","type":"ColumnDataSource"}},"id":"223a4f86-a725-404b-a15c-f1319adee36f","type":"CDSView"},{"attributes":{"fill_alpha":{"value":0.5},"fill_color":{"value":"yellow"},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"a6690539-58c5-47d3-8202-997f47991fd2","type":"Circle"},{"attributes":{"fill_alpha":{"value":0.5},"fill_color":{"value":"#1f77b4"},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"7eead918-2899-4314-96f4-3e71713ac53e","type":"Circle"},{"attributes":{"bottom_units":"screen","fill_alpha":{"value":0.5},"fill_color":{"value":"lightgrey"},"left_units":"screen","level":"overlay","line_alpha":{"value":1.0},"line_color":{"value":"black"},"line_dash":[4,4],"line_width":{"value":2},"plot":null,"render_mode":"css","right_units":"screen","top_units":"screen"},"id":"c07ca512-69b2-4d31-86ef-02efc4021f9e","type":"BoxAnnotation"},{"attributes":{"data_source":{"id":"7d0a5415-fe28-465a-916f-ab83b0eb3b0c","type":"ColumnDataSource"},"glyph":{"id":"7eead918-2899-4314-96f4-3e71713ac53e","type":"Circle"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"de3d1bfe-5132-49a3-8d25-c98032903a04","type":"Circle"},"selection_glyph":null,"view":{"id":"d7bc9735-7b9f-4172-a7cb-66d4438bf92a","type":"CDSView"}},"id":"799ef439-2861-497d-8dc6-75211f80e2f3","type":"GlyphRenderer"},{"attributes":{},"id":"b7e1f868-bab2-4e92-b593-1ebce3cb2faf","type":"HelpTool"},{"attributes":{"active_drag":"auto","active_inspect":"auto","active_scroll":"auto","active_tap":"auto","tools":[{"id":"95629057-2c88-42f9-82a1-3cefc1e391ec","type":"PanTool"},{"id":"985dcead-664e-43c7-8058-9d3ad5149d8a","type":"WheelZoomTool"},{"id":"9718a5c9-d01b-4811-9ae0-e1da3a61d145","type":"BoxZoomTool"},{"id":"72d780e1-1ff7-4750-aa2a-1ffb62c4b695","type":"SaveTool"},{"id":"df912a67-e3da-4be5-8f38-cc714644127d","type":"ResetTool"},{"id":"b7e1f868-bab2-4e92-b593-1ebce3cb2faf","type":"HelpTool"}]},"id":"05715d50-8917-4ef5-87c5-ee52928dac74","type":"Toolbar"},{"attributes":{"overlay":{"id":"c07ca512-69b2-4d31-86ef-02efc4021f9e","type":"BoxAnnotation"}},"id":"9718a5c9-d01b-4811-9ae0-e1da3a61d145","type":"BoxZoomTool"},{"attributes":{"formatter":{"id":"f3ec06ce-9373-456c-b341-9fe106a06ebc","type":"BasicTickFormatter"},"plot":{"id":"c4d6a5ef-c058-4474-8780-dbf36aa49a0b","subtype":"Figure","type":"Plot"},"ticker":{"id":"3339b325-9c16-421f-b821-0b2b91b5ceac","type":"BasicTicker"}},"id":"c16fceeb-1918-4641-9a32-fb660eddeb48","type":"LinearAxis"},{"attributes":{"callback":null,"column_names":["x","y"],"data":{"x":[8.326757729246062,7.1597017814017],"y":[13.706687839899422,12.751167942089456]}},"id":"6f5d1e1a-2d2e-4c02-b0b3-7cf9dd74a851","type":"ColumnDataSource"},{"attributes":{},"id":"4542d0c0-2fa9-460c-b224-5aaaeb40754f","type":"LinearScale"},{"attributes":{},"id":"e8ce0644-5ae2-4aa7-bda0-7ad08c9b41dd","type":"LinearScale"},{"attributes":{"callback":null,"column_names":["x","y"],"data":{"x":[8.326757729246062,7.1597017814017,3.7731409377787117,4.011522255268952,4.313861256667773,11.667870264321984,10.620925151598048],"y":[13.706687839899422,12.751167942089456,8.886178025187835,8.46702978412387,8.01210084902816,5.4355651375941845,5.0578919441042105]}},"id":"7d0a5415-fe28-465a-916f-ab83b0eb3b0c","type":"ColumnDataSource"}],"root_ids":["c4d6a5ef-c058-4474-8780-dbf36aa49a0b"]},"title":"Bokeh Application","version":"0.12.7"}};
            var render_items = [{"docid":"1018e1f1-8a72-41dd-aaf2-39b53612694b","elementid":"d96f7c25-3585-4475-b0ad-20fa3bb54502","modelid":"c4d6a5ef-c058-4474-8780-dbf36aa49a0b"}];
            
            Bokeh.embed.embed_items(docs_json, render_items);
          };
          if (document.readyState != "loading") fn();
          else document.addEventListener("DOMContentLoaded", fn);
        })();
      },
      function(Bokeh) {
      }
    ];
  
    function run_inline_js() {
      
      if ((root.Bokeh !== undefined) || (force === true)) {
        for (var i = 0; i < inline_js.length; i++) {
          inline_js[i].call(root, root.Bokeh);
        }if (force === true) {
          display_loaded();
        }} else if (Date.now() < root._bokeh_timeout) {
        setTimeout(run_inline_js, 100);
      } else if (!root._bokeh_failed_load) {
        console.log("Bokeh: BokehJS failed to load within specified timeout.");
        root._bokeh_failed_load = true;
      } else if (force !== true) {
        var cell = $(document.getElementById("d96f7c25-3585-4475-b0ad-20fa3bb54502")).parents('.cell').data().cell;
        cell.output_area.append_execute_result(NB_LOAD_WARNING)
      }
  
    }
  
    if (root._bokeh_is_loading === 0) {
      console.log("Bokeh: BokehJS loaded, going straight to plotting");
      run_inline_js();
    } else {
      load_libs(js_urls, function() {
        console.log("Bokeh: BokehJS plotting callback run at", now());
        run_inline_js();
      });
    }
  }(window));
</script>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="3.-Determine-the-neighborhood-size">3. Determine the neighborhood size<a class="anchor-link" href="#3.-Determine-the-neighborhood-size">&#182;</a></h2><p><strong>Patch size:</strong> <code>ngh = 1</code> (those without that radius are eliminated). The ones inside that radius are part of the neighborhood.</p>
<p><strong>RED circles represent the neighbors</strong></p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[25]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">p</span> <span class="o">=</span> <span class="n">render_fn</span><span class="p">()</span>
<span class="n">bees</span> <span class="o">=</span> <span class="nb">sorted</span><span class="p">(</span><span class="n">bees</span><span class="p">,</span> <span class="n">key</span><span class="o">=</span><span class="k">lambda</span> <span class="n">x</span><span class="p">:</span> <span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">],</span> <span class="n">reverse</span><span class="o">=</span><span class="kc">True</span><span class="p">)</span>
<span class="n">best_m</span> <span class="o">=</span> <span class="n">bees</span><span class="p">[</span><span class="mi">0</span><span class="p">:</span><span class="n">m</span><span class="p">]</span>
<span class="n">elites</span> <span class="o">=</span> <span class="n">best_m</span><span class="p">[</span><span class="mi">0</span><span class="p">:</span><span class="n">e</span><span class="p">]</span>
<span class="n">neighbors</span> <span class="o">=</span> <span class="p">[</span><span class="n">x</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">bees</span><span class="p">]</span>
<span class="n">neighbors</span><span class="o">.</span><span class="n">remove</span><span class="p">((</span><span class="mf">11.667870264321984</span><span class="p">,</span> <span class="mf">5.4355651375941845</span><span class="p">))</span>
<span class="n">neighbors</span><span class="o">.</span><span class="n">remove</span><span class="p">((</span><span class="mf">10.620925151598048</span><span class="p">,</span> <span class="mf">5.0578919441042105</span><span class="p">))</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<p><img src="attachment:image.png" alt="image.png"></p>
<h2 id="4.-Recruit-onlooker-bees">4. Recruit onlooker bees<a class="anchor-link" href="#4.-Recruit-onlooker-bees">&#182;</a></h2><p><strong>nos = 2</strong> (two new bees for the elite sites)
<strong>nsp = 1</strong> (one bee for the non-elite bees)</p>
<p><strong>GREY CIRCLES ARE THE NEW BEES</strong></p>
<h2 id="5.-Select-the-best-from-each-group">5. Select the best from each group<a class="anchor-link" href="#5.-Select-the-best-from-each-group">&#182;</a></h2><p>Best bees are the <strong>circles in GREEN</strong></p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[79]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">group1</span> <span class="o">=</span> <span class="n">neighbors</span><span class="p">[</span><span class="mi">0</span><span class="p">:</span><span class="mi">2</span><span class="p">]</span>
<span class="n">group2</span> <span class="o">=</span> <span class="n">neighbors</span><span class="p">[</span><span class="mi">2</span><span class="p">:]</span>

<span class="n">nos1</span> <span class="o">=</span> <span class="p">(</span><span class="n">group1</span><span class="p">[</span><span class="mi">0</span><span class="p">][</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="n">DELTA</span><span class="p">,</span> <span class="n">fn</span><span class="p">(</span><span class="n">group1</span><span class="p">[</span><span class="mi">0</span><span class="p">][</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="n">DELTA</span><span class="p">))</span>
<span class="n">nos2</span> <span class="o">=</span> <span class="p">(</span><span class="n">group1</span><span class="p">[</span><span class="mi">1</span><span class="p">][</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="n">DELTA</span><span class="p">,</span> <span class="n">fn</span><span class="p">(</span><span class="n">group1</span><span class="p">[</span><span class="mi">1</span><span class="p">][</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="n">DELTA</span><span class="p">))</span>
<span class="n">nsp1</span> <span class="o">=</span> <span class="p">(</span><span class="n">group2</span><span class="p">[</span><span class="mi">0</span><span class="p">][</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="n">DELTA</span><span class="p">,</span> <span class="n">fn</span><span class="p">(</span><span class="n">group2</span><span class="p">[</span><span class="mi">0</span><span class="p">][</span><span class="mi">0</span><span class="p">]</span> <span class="o">+</span> <span class="n">DELTA</span><span class="p">))</span>
<span class="n">group1</span><span class="o">.</span><span class="n">append</span><span class="p">(</span><span class="n">nos1</span><span class="p">)</span>
<span class="n">group1</span><span class="o">.</span><span class="n">append</span><span class="p">(</span><span class="n">nos2</span><span class="p">)</span>
<span class="n">group2</span><span class="o">.</span><span class="n">append</span><span class="p">(</span><span class="n">nsp1</span><span class="p">)</span>

<span class="n">p</span> <span class="o">=</span> <span class="n">render_fn</span><span class="p">()</span>

<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group1</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group1</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="p">[</span><span class="s2">&quot;green&quot;</span><span class="p">,</span> <span class="s2">&quot;red&quot;</span><span class="p">,</span> <span class="s2">&quot;grey&quot;</span><span class="p">,</span> <span class="s2">&quot;grey&quot;</span><span class="p">],</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group2</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group2</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="p">[</span><span class="s2">&quot;green&quot;</span><span class="p">,</span> <span class="s2">&quot;yellow&quot;</span><span class="p">,</span> <span class="s2">&quot;yellow&quot;</span><span class="p">,</span> <span class="s2">&quot;grey&quot;</span><span class="p">],</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">show</span><span class="p">(</span><span class="n">p</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

<div class="output_wrapper">
<div class="output">


<div class="output_area">

<div class="prompt"></div>



<div class="output_html rendered_html output_subarea ">


    <div class="bk-root">
        <div class="bk-plotdiv" id="73e52580-1180-4b53-9a0b-a35f2a8856cc"></div>
    </div>
<script type="text/javascript">
  
  (function(root) {
    function now() {
      return new Date();
    }
  
    var force = false;
  
    if (typeof (root._bokeh_onload_callbacks) === "undefined" || force === true) {
      root._bokeh_onload_callbacks = [];
      root._bokeh_is_loading = undefined;
    }
  
  
    
    if (typeof (root._bokeh_timeout) === "undefined" || force === true) {
      root._bokeh_timeout = Date.now() + 0;
      root._bokeh_failed_load = false;
    }
  
    var NB_LOAD_WARNING = {'data': {'text/html':
       "<div style='background-color: #fdd'>\n"+
       "<p>\n"+
       "BokehJS does not appear to have successfully loaded. If loading BokehJS from CDN, this \n"+
       "may be due to a slow or bad network connection. Possible fixes:\n"+
       "</p>\n"+
       "<ul>\n"+
       "<li>re-rerun `output_notebook()` to attempt to load from CDN again, or</li>\n"+
       "<li>use INLINE resources instead, as so:</li>\n"+
       "</ul>\n"+
       "<code>\n"+
       "from bokeh.resources import INLINE\n"+
       "output_notebook(resources=INLINE)\n"+
       "</code>\n"+
       "</div>"}};
  
    function display_loaded() {
      if (root.Bokeh !== undefined) {
        var el = document.getElementById("73e52580-1180-4b53-9a0b-a35f2a8856cc");
        if (el != null) {
          el.textContent = "BokehJS " + Bokeh.version + " successfully loaded.";
        }
      } else if (Date.now() < root._bokeh_timeout) {
        setTimeout(display_loaded, 100)
      }
    }
  
  
    function run_callbacks() {
      try {
        root._bokeh_onload_callbacks.forEach(function(callback) { callback() });
      }
      finally {
        delete root._bokeh_onload_callbacks
      }
      console.info("Bokeh: all callbacks have finished");
    }
  
    function load_libs(js_urls, callback) {
      root._bokeh_onload_callbacks.push(callback);
      if (root._bokeh_is_loading > 0) {
        console.log("Bokeh: BokehJS is being loaded, scheduling callback at", now());
        return null;
      }
      if (js_urls == null || js_urls.length === 0) {
        run_callbacks();
        return null;
      }
      console.log("Bokeh: BokehJS not loaded, scheduling load and callback at", now());
      root._bokeh_is_loading = js_urls.length;
      for (var i = 0; i < js_urls.length; i++) {
        var url = js_urls[i];
        var s = document.createElement('script');
        s.src = url;
        s.async = false;
        s.onreadystatechange = s.onload = function() {
          root._bokeh_is_loading--;
          if (root._bokeh_is_loading === 0) {
            console.log("Bokeh: all BokehJS libraries loaded");
            run_callbacks()
          }
        };
        s.onerror = function() {
          console.warn("failed to load library " + url);
        };
        console.log("Bokeh: injecting script tag for BokehJS library: ", url);
        document.getElementsByTagName("head")[0].appendChild(s);
      }
    };var element = document.getElementById("73e52580-1180-4b53-9a0b-a35f2a8856cc");
    if (element == null) {
      console.log("Bokeh: ERROR: autoload.js configured with elementid '73e52580-1180-4b53-9a0b-a35f2a8856cc' but no matching script tag was found. ")
      return false;
    }
  
    var js_urls = [];
  
    var inline_js = [
      function(Bokeh) {
        (function() {
          var fn = function() {
            var docs_json = {"db26c663-baa0-43d4-9833-529c7e334296":{"roots":{"references":[{"attributes":{"source":{"id":"bf6964ed-b869-4702-8b14-6dc1eaf8bf7f","type":"ColumnDataSource"}},"id":"fb830525-8930-4d8e-a6ce-2e064bd7f4da","type":"CDSView"},{"attributes":{"callback":null},"id":"c00ee5b5-0b55-47e3-bc15-0ab904528664","type":"DataRange1d"},{"attributes":{"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"x":{"field":"x"},"y":{"field":"y"}},"id":"b8def848-cdb9-4e1d-947c-9791fb438482","type":"Line"},{"attributes":{"source":{"id":"b10a7da8-3324-42f4-a09f-ece45f5a7bf3","type":"ColumnDataSource"}},"id":"4e429d90-8846-4f2c-a796-e9389491265c","type":"CDSView"},{"attributes":{},"id":"cbad55d8-4d08-42ec-a781-52dd521a67ba","type":"BasicTicker"},{"attributes":{"fill_alpha":{"value":0.1},"fill_color":{"value":"#1f77b4"},"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"23794f45-dc9b-4f73-993b-df58c5f0859b","type":"Circle"},{"attributes":{"fill_alpha":{"value":0.5},"fill_color":{"field":"fill_color"},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"7192ebcc-4c03-45c4-98db-eefdf3f3f51a","type":"Circle"},{"attributes":{"source":{"id":"d8bc89b8-cf27-4363-891c-74ac5ffee1ae","type":"ColumnDataSource"}},"id":"3fbe9349-f08a-49e9-8028-7004aa0fd150","type":"CDSView"},{"attributes":{},"id":"defe0280-9c3a-4161-a9b1-41190cdf2029","type":"HelpTool"},{"attributes":{"below":[{"id":"656c7e7a-a872-4ed1-95ca-f964580f3687","type":"LinearAxis"}],"left":[{"id":"6ae992b8-5cfd-4e72-9da8-4389f7729f89","type":"LinearAxis"}],"renderers":[{"id":"656c7e7a-a872-4ed1-95ca-f964580f3687","type":"LinearAxis"},{"id":"a96269fa-5815-436f-8085-7eac0cbd4217","type":"Grid"},{"id":"6ae992b8-5cfd-4e72-9da8-4389f7729f89","type":"LinearAxis"},{"id":"9cbe2805-fff0-48c4-a147-9fdb39f75412","type":"Grid"},{"id":"1cc8b526-8cac-4bd5-8b2f-2b2aafd8aede","type":"BoxAnnotation"},{"id":"e272f5f0-6984-472b-8281-c624d3928422","type":"GlyphRenderer"},{"id":"6def98fa-0d40-440c-b85a-6ab08a900d11","type":"GlyphRenderer"},{"id":"75be864c-8291-4480-81f9-089e45090bee","type":"GlyphRenderer"}],"title":{"id":"3728418c-ed3f-42b1-a13d-15de7c14e2c3","type":"Title"},"toolbar":{"id":"b257ee4b-5f1b-4b49-9e81-e652bfebf197","type":"Toolbar"},"x_range":{"id":"f330f496-ecc5-4972-891c-778672609b56","type":"Range1d"},"x_scale":{"id":"5222b23d-1d04-45db-a972-9f8341f80e0f","type":"LinearScale"},"y_range":{"id":"c00ee5b5-0b55-47e3-bc15-0ab904528664","type":"DataRange1d"},"y_scale":{"id":"7bf55c2f-73b1-42ce-bde6-3bdd9eb07c4b","type":"LinearScale"}},"id":"8eed9d56-a313-49a5-bb1f-073fa10d5605","subtype":"Figure","type":"Plot"},{"attributes":{},"id":"7bf55c2f-73b1-42ce-bde6-3bdd9eb07c4b","type":"LinearScale"},{"attributes":{"callback":null,"column_names":["x","y","fill_color"],"data":{"fill_color":["green","red","grey","grey"],"x":[8.326757729246062,7.1597017814017,8.626757729246062,7.4597017814017],"y":[13.706687839899422,12.751167942089456,13.088273019869177,13.443672276074933]}},"id":"d8bc89b8-cf27-4363-891c-74ac5ffee1ae","type":"ColumnDataSource"},{"attributes":{},"id":"1bf86fae-b6dd-4bc7-9134-8ff097068cfe","type":"PanTool"},{"attributes":{"data_source":{"id":"b10a7da8-3324-42f4-a09f-ece45f5a7bf3","type":"ColumnDataSource"},"glyph":{"id":"8c7164b5-07a2-4caa-9735-690c0e502623","type":"Line"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"b8def848-cdb9-4e1d-947c-9791fb438482","type":"Line"},"selection_glyph":null,"view":{"id":"4e429d90-8846-4f2c-a796-e9389491265c","type":"CDSView"}},"id":"e272f5f0-6984-472b-8281-c624d3928422","type":"GlyphRenderer"},{"attributes":{},"id":"7fd40690-b001-4345-b739-b9b368fd9736","type":"BasicTickFormatter"},{"attributes":{"callback":null,"column_names":["x","y"],"data":{"x":{"__ndarray__":"AAAAAAAAAABlk0022WTDP2WTTTbZZNM/GF100UUX3T9lk0022WTjPz744IMPPug/GF100UUX7T/44IMPPvjwP2WTTTbZZPM/0kUXXXTR9T8++OCDDz74P6uqqqqqqvo/GF100UUX/T+EDz744IP/P/jggw8++ABAL7rooosuAkBlk0022WQDQJtssskmmwRA0kUXXXTRBUAIH3zwwQcHQD744IMPPghAddFFF110CUCrqqqqqqoKQOGDDz744AtAGF100UUXDUBONtlkk00OQIQPPvjggw9AXXTRRRddEED44IMPPvgQQJRNNtlkkxFAL7rooosuEkDKJptssskSQGWTTTbZZBNAAAAAAAAAFECbbLLJJpsUQDbZZJNNNhVA0kUXXXTRFUBtsskmm2wWQAgffPDBBxdAo4suuuiiF0A++OCDDz4YQNlkk0022RhAddFFF110GUAQPvjggw8aQKuqqqqqqhpARhdddNFFG0Dhgw8++OAbQHzwwQcffBxAGF100UUXHUCzySabbLIdQE422WSTTR5A6aKLLrroHkCEDz744IMfQBA++OCDDyBAXXTRRRddIECrqqqqqqogQPjggw8++CBARhdddNFFIUCUTTbZZJMhQOGDDz744CFAL7rooosuIkB88MEHH3wiQMomm2yyySJAF1100UUXI0Blk0022WQjQLPJJptssiNAAAAAAAAAJEBONtlkk00kQJtssskmmyRA6aKLLrroJEA22WSTTTYlQIQPPvjggyVA0kUXXXTRJUAffPDBBx8mQG2yySabbCZAuuiiiy66JkAIH3zwwQcnQFZVVVVVVSdAo4suuuiiJ0DxwQcffPAnQD744IMPPihAjC666KKLKEDZZJNNNtkoQCebbLLJJilAddFFF110KUDCBx988MEpQBA++OCDDypAXXTRRRddKkCrqqqqqqoqQPjggw8++CpARhdddNFFK0CUTTbZZJMrQOGDDz744CtAL7rooosuLEB88MEHH3wsQMomm2yyySxAGF100UUXLUBlk0022WQtQLPJJptssi1AAAAAAAAALkA=","dtype":"float64","shape":[100]},"y":{"__ndarray__":"AAAAAAAAJEBBju2/2gUkQOWJOlEmFyRAJ7PABBczJEAvbh8tYVgkQHYfdJBEhSRAWMSs75u3JEC7f4Yp8OwkQHeYiWKOIiVA1XXpgqBVJUDJDdBHR4MlQLbe2xe1qCVAHQ7hwkjDJUAA3pFTp9AlQKDYox7UziVAQts7Rka8JUCIopz5+pclQKiJz8+DYSVAgW6rtxAZJUCQe3sXdb8kQOYTudknViRAlQjaST7fI0BlnRTLYV0jQAkZGJrA0yJAS/T48PlFIkCTBN0IBrghQPYuQ5YaLiFAp8AaeoysIEBrWGF6rzcgQKTb189ppx9Aimp7RxQJH0Ayqtv4b5seQNZdr7aHZB5AINApYydpHkA1lVEMq6weQK9MPePWMB9AdnpHcLn1H0CnCICSzHwgQMOdDhF3HCFALzroWjTXIUBazeZfgqkiQKSrI+cUjyNAgcVFtuuCJEAGSZphbn8lQLQTvyqNfiZAq6LHLOZ5J0BGxFTy7WooQJ0pFXUaSylAsPJvbw8UKkDO1GnZyr8qQJ4ktGHQSCtA2mycs1KqK0DK1WhiWeArQG09gWLi5ytAQjdQEP6+K0BuAI/j5GQrQAEVBhMG2ipAqCDVlw4gKkC1kgov6DkpQGThiyuwKyhAQhfGH6b6JkB5FfmcEq0lQJEFynsmSiRAkF67VdPZIkCHCtIHnmQhQNohfoXY5h9AbO5HppweHUA4tr7XjIIaQHYPo6cdJBhAP8fvzsATFkA0PyLJdWAUQNPQxuRgFxNAUlpMmGtDEkBlD0m58OwRQCdHp/V2GRJAT+zpnnvLEkDj7ZR5TwIUQH5o5dcGuhVAVy/h0X3rF0BAQSTwcIwaQLKSth2qjx1AW0FkmaByIEDdUtx0dz0iQFOsPUo4HiRAv0HIOv0JJkB5+hQcW/UnQK7h4VSl1ClAA9FXxzScK0D2kIUasEAtQLeb96NTty5AD9JELDf2L0BauznnR3owQIWoJiF21TBAe+5u/rQJMUDJy/Xb8BQxQBanQRAF9jBAQIlP0sesMECaSqpLEDowQATbVihtPy9AXetY9RrBLUA=","dtype":"float64","shape":[100]}}},"id":"b10a7da8-3324-42f4-a09f-ece45f5a7bf3","type":"ColumnDataSource"},{"attributes":{"fill_alpha":{"value":0.1},"fill_color":{"value":"#1f77b4"},"line_alpha":{"value":0.1},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"1265bf31-d615-4f36-a860-1479e94300b4","type":"Circle"},{"attributes":{"formatter":{"id":"59890cbd-3f83-4b52-be2a-b6ef763d8115","type":"BasicTickFormatter"},"plot":{"id":"8eed9d56-a313-49a5-bb1f-073fa10d5605","subtype":"Figure","type":"Plot"},"ticker":{"id":"cbad55d8-4d08-42ec-a781-52dd521a67ba","type":"BasicTicker"}},"id":"6ae992b8-5cfd-4e72-9da8-4389f7729f89","type":"LinearAxis"},{"attributes":{"callback":null,"column_names":["x","y","fill_color"],"data":{"fill_color":["green","yellow","yellow","grey"],"x":[3.7731409377787117,4.011522255268952,4.313861256667773,4.073140937778712],"y":[8.886178025187835,8.46702978412387,8.01210084902816,8.36556137459505]}},"id":"bf6964ed-b869-4702-8b14-6dc1eaf8bf7f","type":"ColumnDataSource"},{"attributes":{"dimension":1,"plot":{"id":"8eed9d56-a313-49a5-bb1f-073fa10d5605","subtype":"Figure","type":"Plot"},"ticker":{"id":"cbad55d8-4d08-42ec-a781-52dd521a67ba","type":"BasicTicker"}},"id":"9cbe2805-fff0-48c4-a147-9fdb39f75412","type":"Grid"},{"attributes":{"line_color":{"value":"#1f77b4"},"x":{"field":"x"},"y":{"field":"y"}},"id":"8c7164b5-07a2-4caa-9735-690c0e502623","type":"Line"},{"attributes":{},"id":"59890cbd-3f83-4b52-be2a-b6ef763d8115","type":"BasicTickFormatter"},{"attributes":{},"id":"5222b23d-1d04-45db-a972-9f8341f80e0f","type":"LinearScale"},{"attributes":{},"id":"25b50a06-979c-471a-a6b7-6f849893f375","type":"WheelZoomTool"},{"attributes":{},"id":"9678ec4e-923d-450e-b63d-026c7a71d358","type":"SaveTool"},{"attributes":{"data_source":{"id":"bf6964ed-b869-4702-8b14-6dc1eaf8bf7f","type":"ColumnDataSource"},"glyph":{"id":"0ae79e41-a3f6-4dc7-ae92-4314e65a00d7","type":"Circle"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"1265bf31-d615-4f36-a860-1479e94300b4","type":"Circle"},"selection_glyph":null,"view":{"id":"fb830525-8930-4d8e-a6ce-2e064bd7f4da","type":"CDSView"}},"id":"75be864c-8291-4480-81f9-089e45090bee","type":"GlyphRenderer"},{"attributes":{"data_source":{"id":"d8bc89b8-cf27-4363-891c-74ac5ffee1ae","type":"ColumnDataSource"},"glyph":{"id":"7192ebcc-4c03-45c4-98db-eefdf3f3f51a","type":"Circle"},"hover_glyph":null,"muted_glyph":null,"nonselection_glyph":{"id":"23794f45-dc9b-4f73-993b-df58c5f0859b","type":"Circle"},"selection_glyph":null,"view":{"id":"3fbe9349-f08a-49e9-8028-7004aa0fd150","type":"CDSView"}},"id":"6def98fa-0d40-440c-b85a-6ab08a900d11","type":"GlyphRenderer"},{"attributes":{"overlay":{"id":"1cc8b526-8cac-4bd5-8b2f-2b2aafd8aede","type":"BoxAnnotation"}},"id":"b1cdab4d-ccf7-428e-9253-56d2aec49b62","type":"BoxZoomTool"},{"attributes":{"active_drag":"auto","active_inspect":"auto","active_scroll":"auto","active_tap":"auto","tools":[{"id":"1bf86fae-b6dd-4bc7-9134-8ff097068cfe","type":"PanTool"},{"id":"25b50a06-979c-471a-a6b7-6f849893f375","type":"WheelZoomTool"},{"id":"b1cdab4d-ccf7-428e-9253-56d2aec49b62","type":"BoxZoomTool"},{"id":"9678ec4e-923d-450e-b63d-026c7a71d358","type":"SaveTool"},{"id":"f686c4c5-bac9-42fd-81a4-402b5b7cba65","type":"ResetTool"},{"id":"defe0280-9c3a-4161-a9b1-41190cdf2029","type":"HelpTool"}]},"id":"b257ee4b-5f1b-4b49-9e81-e652bfebf197","type":"Toolbar"},{"attributes":{"formatter":{"id":"7fd40690-b001-4345-b739-b9b368fd9736","type":"BasicTickFormatter"},"plot":{"id":"8eed9d56-a313-49a5-bb1f-073fa10d5605","subtype":"Figure","type":"Plot"},"ticker":{"id":"ad4039d5-d467-4a55-9a59-ac491cc45756","type":"BasicTicker"}},"id":"656c7e7a-a872-4ed1-95ca-f964580f3687","type":"LinearAxis"},{"attributes":{},"id":"f686c4c5-bac9-42fd-81a4-402b5b7cba65","type":"ResetTool"},{"attributes":{"bottom_units":"screen","fill_alpha":{"value":0.5},"fill_color":{"value":"lightgrey"},"left_units":"screen","level":"overlay","line_alpha":{"value":1.0},"line_color":{"value":"black"},"line_dash":[4,4],"line_width":{"value":2},"plot":null,"render_mode":"css","right_units":"screen","top_units":"screen"},"id":"1cc8b526-8cac-4bd5-8b2f-2b2aafd8aede","type":"BoxAnnotation"},{"attributes":{"plot":{"id":"8eed9d56-a313-49a5-bb1f-073fa10d5605","subtype":"Figure","type":"Plot"},"ticker":{"id":"ad4039d5-d467-4a55-9a59-ac491cc45756","type":"BasicTicker"}},"id":"a96269fa-5815-436f-8085-7eac0cbd4217","type":"Grid"},{"attributes":{},"id":"ad4039d5-d467-4a55-9a59-ac491cc45756","type":"BasicTicker"},{"attributes":{"callback":null,"end":16},"id":"f330f496-ecc5-4972-891c-778672609b56","type":"Range1d"},{"attributes":{"fill_alpha":{"value":0.5},"fill_color":{"field":"fill_color"},"line_color":{"value":"#1f77b4"},"size":{"units":"screen","value":15},"x":{"field":"x"},"y":{"field":"y"}},"id":"0ae79e41-a3f6-4dc7-ae92-4314e65a00d7","type":"Circle"},{"attributes":{"plot":null,"text":""},"id":"3728418c-ed3f-42b1-a13d-15de7c14e2c3","type":"Title"}],"root_ids":["8eed9d56-a313-49a5-bb1f-073fa10d5605"]},"title":"Bokeh Application","version":"0.12.7"}};
            var render_items = [{"docid":"db26c663-baa0-43d4-9833-529c7e334296","elementid":"73e52580-1180-4b53-9a0b-a35f2a8856cc","modelid":"8eed9d56-a313-49a5-bb1f-073fa10d5605"}];
            
            Bokeh.embed.embed_items(docs_json, render_items);
          };
          if (document.readyState != "loading") fn();
          else document.addEventListener("DOMContentLoaded", fn);
        })();
      },
      function(Bokeh) {
      }
    ];
  
    function run_inline_js() {
      
      if ((root.Bokeh !== undefined) || (force === true)) {
        for (var i = 0; i < inline_js.length; i++) {
          inline_js[i].call(root, root.Bokeh);
        }if (force === true) {
          display_loaded();
        }} else if (Date.now() < root._bokeh_timeout) {
        setTimeout(run_inline_js, 100);
      } else if (!root._bokeh_failed_load) {
        console.log("Bokeh: BokehJS failed to load within specified timeout.");
        root._bokeh_failed_load = true;
      } else if (force !== true) {
        var cell = $(document.getElementById("73e52580-1180-4b53-9a0b-a35f2a8856cc")).parents('.cell').data().cell;
        cell.output_area.append_execute_result(NB_LOAD_WARNING)
      }
  
    }
  
    if (root._bokeh_is_loading === 0) {
      console.log("Bokeh: BokehJS loaded, going straight to plotting");
      run_inline_js();
    } else {
      load_libs(js_urls, function() {
        console.log("Bokeh: BokehJS plotting callback run at", now());
        run_inline_js();
      });
    }
  }(window));
</script>
</div>

</div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="6.-Assign-the-remaining-as-scouts">6. Assign the remaining as scouts<a class="anchor-link" href="#6.-Assign-the-remaining-as-scouts">&#182;</a></h2><p><strong>n - m = 7 - 4 = 3</strong> =&gt; 3 new scout bees</p>
<p><strong>BLUE SQUARES REPRESENT THE SCOUTS</strong></p>

</div>
</div>
</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">scouts</span> <span class="o">=</span> <span class="p">[</span><span class="n">gen_num</span><span class="p">()</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="nb">range</span><span class="p">(</span><span class="mi">0</span><span class="p">,</span> <span class="n">n</span> <span class="o">-</span> <span class="n">m</span><span class="p">)]</span>

<span class="n">p</span> <span class="o">=</span> <span class="n">render_fn</span><span class="p">()</span>

<span class="n">p</span><span class="o">.</span><span class="n">square</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">scouts</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">scouts</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">10</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="s2">&quot;blue&quot;</span><span class="p">,</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group1</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group1</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="p">[</span><span class="s2">&quot;green&quot;</span><span class="p">,</span> <span class="s2">&quot;red&quot;</span><span class="p">,</span> <span class="s2">&quot;grey&quot;</span><span class="p">,</span> <span class="s2">&quot;grey&quot;</span><span class="p">],</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">p</span><span class="o">.</span><span class="n">circle</span><span class="p">([</span><span class="n">x</span><span class="p">[</span><span class="mi">0</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group2</span><span class="p">],</span> <span class="p">[</span><span class="n">x</span><span class="p">[</span><span class="mi">1</span><span class="p">]</span> <span class="k">for</span> <span class="n">x</span> <span class="ow">in</span> <span class="n">group2</span><span class="p">],</span> <span class="n">size</span><span class="o">=</span><span class="mi">15</span><span class="p">,</span> <span class="n">fill_color</span><span class="o">=</span><span class="p">[</span><span class="s2">&quot;green&quot;</span><span class="p">,</span> <span class="s2">&quot;yellow&quot;</span><span class="p">,</span> <span class="s2">&quot;yellow&quot;</span><span class="p">,</span> <span class="s2">&quot;grey&quot;</span><span class="p">],</span> <span class="n">fill_alpha</span><span class="o">=</span><span class="mf">0.5</span><span class="p">)</span>
<span class="n">show</span><span class="p">(</span><span class="n">p</span><span class="p">)</span>
</pre></div>

</div>
</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div>
<div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="END-OF-THE-CYCLE">END OF THE CYCLE<a class="anchor-link" href="#END-OF-THE-CYCLE">&#182;</a></h2>
</div>
</div>
</div>
    </div>
  </div>