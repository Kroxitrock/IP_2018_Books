<%--
  Created by IntelliJ IDEA.
  User: Andrey
  Date: 3/4/2018
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>Page Title</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="style/style.css">
  <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
  <script>
      $(document).ready(function(){
          $("#user").click(function(){
              var images = $('#user').attr('src');
              if(images == "img/login.png"){
                  if ($('#sideBar').is(":hidden")) document.getElementById('sideBar').style.display='block';
                  else document.getElementById('sideBar').style.display='none';
              }else{
                  document.getElementById('loginForm').style.display='block';
              }
          });


          $("#signupButn1").click(function() {
              document.getElementById('loginForm').style.display='none';
              document.getElementById('singupForm').style.display='block';
          });


          $("#login2").click(function() {
              document.getElementById('loginForm').style.display='block';
              document.getElementById('singupForm').style.display='none';
          });
      });
  </script>
</head>
<body>
<%@include  file="header/header.html" %>


<!-- LogIn Form -->
<div id="loginForm" class="modal">
  <form class="modal-content animate" action="/action_page.php">

    <div class="container">
      <label for="x" id = "x" onclick="document.getElementById('loginForm').style.display='none'"><b>X</b></label><br>

      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="name" required>

      <label for="pass"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="pass" required>

      <button type="submit" id = "login1" class = "buttons login">Log in</button>
      <button type="submit" id = "signupButn1" class = "buttons signupButn">Sign up	</button>
      <button class="loginBtn" id = "facebook">Login with Facebook</button>
      <button class="loginBtn" id = "google">Login with Google</button>

    </div>

    <div class="container" id = "forgotPass">
      <span class="pass"><a href="#">Forgot password?</a></span>
    </div>

  </form>
</div>


<!-- SingUp Form -->
<div id="singupForm" class="modal">
  <form class="modal-content animate" action="/action_page.php">

    <div class="container">
      <label for="x" id = "x" onclick="document.getElementById('singupForm').style.display='none'"><b>X</b></label><br>

      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="name" required>

      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" required>

      <label for="pass"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="pass" required>
      <label for="cPass"><b>Confirm Password</b></label>
      <input type="password" placeholder="Enter Confirm Password" name="cPass" required>

      <button type="submit" id = "signupButn2" class = "buttons signupButn">Sign up	</button>
      <button type="submit" id = "login2" class = "buttons login">Log in</button>

    </div>

  </form>
</div>

<!-- Side bar -->
<div id="sideBar">
  <p>My profile</p>
  <p id = "logout">Log out</p>
</div>


<div id = "page">
  <!-- Slideshow container -->
  <div class="slideshow-container">
    <div class="mySlides fade">
      <img src="img/slides3.jpg" style="width:100%">
    </div>

    <div class="mySlides fade">
      <img src="img/slides2.jpg" style="width:100%">
    </div>

    <div class="mySlides fade">
      <img src="img/slides1.jpg" style="width:100%">
    </div>
  </div>
  <br>
  <div style="text-align:center">
    <span class="dot" onclick="currentSlide(1)"></span>
    <span class="dot" onclick="currentSlide(2)"></span>
    <span class="dot" onclick="currentSlide(3)"></span>
  </div>


  <p class = "homePage">Genres</p>
  <div class="column">
    <ul class="GenresList">
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Science fiction</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Satire</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Drama</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Action and Adventure</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Romance</a></li>
    </ul>
  </div>
  <div class="column">
    <ul class="GenresList">
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Mystery</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Horror</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Self help</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Health</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Guide</a></li>
    </ul>
  </div>
  <div class="column">
    <ul class="GenresList">
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Travel</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Children's</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Science</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">History</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Math</a></li>
    </ul>
  </div>
  <div class="column">
    <ul class="GenresList">
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Anthology</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Poetry</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Encyclopedias</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Dictionaries</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Comics</a></li>

    </ul>
  </div>
  <div class="column">
    <ul class="GenresList">
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Art</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Cookbooks</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Diaries</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Journals</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Prayer books</a></li>
    </ul>
  </div>
  <div class="column">
    <ul class="GenresList">
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Series</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Trilogy</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Biographies</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Autobiographies</a></li>
      <li class = "genre" ><a href="https://www.google.bg" style = "text-decoration: none">Fantasy</a></li>
    </ul>
  </div>


  <p class = "homePage">Best Sellers</p>
  <div class = "Bestsellers">
    <div class = "book">
      <img class = "bookImg" src="img/bestseller1.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">Wonder</p>
        <p class = "author">by R. J. Palacio</p>
      </div>
    </div>
    <div class = "book">
      <img class = "bookImg" src="img/bestseller2.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">Milk and Honey</p>
        <p class = "author">by Rupi Kaur</p>
      </div>
    </div>
    <div class = "book">
      <img class = "bookImg" src="img/bestseller3.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">Giraffes Can't Dance</p>
        <p class = "author">by Giles Andreae</p>
      </div>
    </div>
    <div class = "book">
      <img class = "bookImg" src="img/bestseller4.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">The Subtle Art of Not Giving a F*ck</p>
        <p class = "author">by Mark Manson</p>
      </div>
    </div>
    <div class = "book">
      <img class = "bookImg" src="img/bestseller5.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">The Getaway</p>
        <p class = "author">by Jeff Kinney</p>
      </div>
    </div>
    <div class = "book">
      <img class = "bookImg" src="img/bestseller6.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">The Instant Pot® Electric Pressure Cooker Cookbook</p>
        <p class = "author">by Laurel Randolph</p>
      </div>
    </div>
    <div class = "book">
      <img class = "bookImg" src="img/bestseller7.jpg">
      <div class = "bookInfo" >
        <p class = "bookName">Hillbilly Elegy</p>
        <p class = "author">by J. D. Vance</p>
      </div>
    </div>
  </div>
</div>




<script>
    var slideIndex = 0;
    showSlides();

    function showSlides() {
        var i;
        var slides = document.getElementsByClassName("mySlides");
        var dots = document.getElementsByClassName("dot");
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        slideIndex++;
        if (slideIndex > slides.length) {slideIndex = 1}
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
        }
        slides[slideIndex-1].style.display = "block";
        dots[slideIndex-1].className += " active";
        setTimeout(showSlides, 5000); // Change image every 2 seconds
    }
</script>
</body>
</html>