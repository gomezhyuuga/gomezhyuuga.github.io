$(document).ready(() => {
  console.log("IT WORKS");
  let icons = $('.animated.devicons');
  var index = 1;
  const limit = icons.length - 1;
  setInterval(() => {
    if (index > limit) { index = 0; }
    let el = $('.animated.devicons.active');
    let next = $(icons.get(index));
    el.removeClass('fadeOut active');
    $(next).addClass('fadeIn active');
    index++;
  }, 2000);
});
