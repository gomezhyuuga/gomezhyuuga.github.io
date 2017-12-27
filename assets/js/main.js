const QUOTES_API = '//quotesondesign.com/wp-json/posts?filter[orderby]=rand&filter[posts_per_page]=1';
$(document).ready(() => {
  let icons = $('.animated.nf');
  var index = 1;
  const limit = icons.length - 1;
  setInterval(() => {
    if (index > limit) { index = 0; }
    let el = $('.animated.nf.active');
    let next = $(icons.get(index));
    el.removeClass('fadeOut active');
    $(next).addClass('fadeIn active');
    index++;
  }, 2000);

  $('.chocolat-parent').Chocolat({
    // container: '#page-content'
  });

  let quote_element = $('#quote');
  if (quote_element) {
    $.getJSON(QUOTES_API)
      .done(response => {
        let quote = response.pop();
        let source = undefined;
        let { content, title, custom_meta } = quote;
        quote_element.html(content);
        if (custom_meta) source = $(custom_meta.Source);
        let author_element = $('#quote_author');
        if (source) {
          author_element.attr('href', source.attr('href'))
        } else {
          author_element.attr('href', quote.link);
        }
        author_element.text(`- ${title}`);
      });
  }
});

