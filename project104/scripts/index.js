$("#darkOrLight").click(function () {

    // Toggle dark mode class on body
    $("body").toggleClass("dark-mode");

    // Change button icon depending on mode
    if ($("body").hasClass("dark-mode")) {
        $("#darkOrLight")
            .text("🌙")
            .removeClass("btn-light")
            .addClass("btn-dark");
    } else {
        $("#darkOrLight")
            .text("☀️")
            .removeClass("btn-dark")
            .addClass("btn-light");
    }
});
