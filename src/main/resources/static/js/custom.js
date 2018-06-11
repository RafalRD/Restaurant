function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}



(function($) {

  // Menu filer
  $("#menu-flters li a").click(function() {
    $("#menu-flters li a").removeClass('active');
    $(this).addClass('active');

    var selectedFilter = $(this).data("filter");
    //  $("#menu-wrapper").fadeTo(100, 0);

    $(".menu-restaurant").fadeOut();

    setTimeout(function() {
      $(selectedFilter).slideDown();
      //$("#menu-wrapper").fadeTo(300, 1);
    }, 300);
  });

  // Add smooth scrolling to all links in navbar + footer link
  $(".sidenav a").on('click', function(event) {
    var hash = this.hash;
    if (hash) {
      event.preventDefault();
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function() {
        window.location.hash = hash;
      });
    }

  });

  $(".sidenav a").on('click', function() {
		closeNav();
	});

})(jQuery);

(function($){

    $("#save").on('submit', function(){

        var errors = false;
        var emailReg = /^([a-zA-Z0-9\\.]+)@([a-zA-Z0-9\\-\\_\\.]+)\.([a-zA-Z0-9]+)$/i;

        //validate email
        $(".errors").remove();

        //refresh error messages on submit
        if($("#name").val() === ""){
            $("#name").after( "<span class='errors'> Missing Name! </span> ");
            errors = true;
        }
        //date
        if($("#date").val() === ""){
            $("#date").after( "<span class='errors'> Missing date! </span> ");
            errors = true;
        }
        //time
        if($("#time").val() === ""){
            $("#time").after( "<span class='errors'> Missing time! </span> ");
            errors = true;
        }
        //validate name field has entry
        if($("#email").val() === ""){
            $("#email").after("<span class='errors'> Missing email! </span>");
            errors = true;
        }else if(!emailReg.test($("#email").val())){
            $("#email").after( "<span class='errors'> Email look bad! </span> ")
            errors = true;
        }
        //time
        if($("#phone").val() === ""){
            $("#phone").after( "<span class='errors'> Missing phone! </span> ");
            errors = true;
        }

        // validate mesage
        if($("#people").val() === ""){
            $("#people").after( "<span class='errors'>Missing number of people!</span> ");
            errors = true;
        }

        // // validate mesage
        // if($("#message").val() === ""){
        //     $("#message").after( "<span class='errors'>Missing number of people!</span> ");
        //     errors = true;
        // }

        return !errors;

    });

})(jQuery);
