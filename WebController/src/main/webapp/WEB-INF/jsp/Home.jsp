<!DOCTYPE html> 
<html lang="en"> 
  
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="style/home-style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
   
    <title>Home</title>
    <style type="text/css">
   

.footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 60px; /* Set the fixed height of the footer here */
  line-height: 60px; /* Vertically center the text there */
  background-color: #111010;
}
.container1 {
  width: auto;
  max-width: 680px;
  padding: 0 15px;
  margin-left: 75%;
}
.sidebar {
  height: 100%; /* 100% Full-height */
  width: 0; /* 0 width - change this with JavaScript */
  position: fixed; /* Stay in place */
  /* z-index: 1; Stay on top */
  top: 0;
  right: 0;
  background-color: #111; /* Black*/
  overflow-x: hidden; /* Disable horizontal scroll */
  padding-top: 60px; /* Place content 60px from the top */
  transition: 0.5s; /* 0.5 second transition effect to slide in the sidebar */
  z-index: 9;
}

/* The sidebar links */
.sidebar a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

/* When you mouse over the navigation links, change their color */
.sidebar a:hover {
  color: #f1f1f1;
}

/* Position and style the close button (top right corner) */
.sidebar .closebtn {
  position: absolute;
  top: 6%;
  right: 10px;
  font-size: 36px;
  margin-left: 50px;
}

/* The button used to open the sidebar */
.openbtn {
  font-size: 20px;
  cursor: pointer;
  /* background-color: #111; */
  color: whitesmoke;
  background-color:  #343a40;
  /* padding: 10px 15px; */
  border: none;
  position: fixed;
  margin-left: -5%;
      margin-top: -14px;
  outline: none;
  /* margin-top: 38%; */
  /* margin-bottom: -40%; */
}

.openbtn:hover {
  background-color: #444;
}

/* Style page content - use this if you want to push the page content to the right when you open the side navigation */
#main {
  transition: margin-right .5s; 
  padding: 20px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
    
    </style>
    
    

</head>
<body>
 	 <nav class="navbar navbar-expand-lg  navbar-dark bg-dark">
  <a class="navbar-brand" href="#" style="margin-left: 20px; margin-right:900px;">
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjxGDl9hG7JE2Z4YhCgE3D2P4rjn0f0jRiXA&usqp=CAU" width="30" height="30" class="d-inline-block align-top" alt="">
           Portfolio Manager</a>
        
        <form action="/logout" method="GET"><button type="button float-right" style="margin-right: 20px;" class="btn btn-outline-light">LOGOUT</button></form>
      
      
      </nav> 
      
    
   
    <br>
    <div class="container" style="margin-top: 7%">
        <div class="row">
        	 <div class="col-sm-4">
                <div class="card text-center">
                    <img class="card-img-top img-fluid" src="https://uci.ac.cr/wp-content/uploads/2016/08/portfolio-management.jpg" style="width:600x;height:300px;" alt="Card image cap">
                   
                     
                    <div class="card-block">
                        <h4 class="card-title">View Portfolio</h4>
                        <p class="card-text">Click to view shares and funds</p>
                        <form action="/viewportfolio" method="GET"><button type="submit" value="submit" class="btn btn-outline-secondary">PORTFOLIO</button></form>
                        <p></p>
                    </div>
                </div>
            </div>
            
            <div class="col-sm-4">
                <div class="card text-center">
                    <img class="card-img-top img-fluid" src="https://www.thestreet.com/.image/t_share/MTY5NDYzMzA2MzI1NTk5NzA3/stock-vs-shares.png" style="width:600x;height:300px;" alt="Card image cap">
                    <div class="card-block">
                        <h4 class="card-title">Net Worth</h4>
                        <p class="card-text">Click to calculate net worth</p>
                        <form action="/viewNetworth" method="GET"><button type="submit" value="submit" class="btn btn-outline-secondary">NETWORTH</button></form>
                        <p></p>
                    </div>
                </div>
            </div>
            
                       
            
            <div class="col-sm-4">
                <div class="card text-center">
                    <img class="card-img-top img-fluid" src="https://g.foolcdn.com/image/?url=https%3A%2F%2Fg.foolcdn.com%2Feditorial%2Fimages%2F606349%2Finvestor-pressing-sell-button-getty.jpg&w=700&op=resize" style="width:600x;height:300px;" alt="Card image cap">
                    <div class="card-block">
                        <h4 class="card-title">Sell </h4>
                        <p class="card-text">Click to sell asset</p>
                        <form action="/sellAssets" method="GET"><button type="submit" name="submit" class="btn btn-outline-secondary">SELL</button></form>
                        <p></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
        <script type="text/javascript">
        function openNav() {
			document.getElementById("mySidebar").style.width = "250px";
		
		}

		/* Set the width of the sidebar to 0 and the left margin of the page content to 0 */
		function closeNav() {
			document.getElementById("mySidebar").style.width = "0";
			
		}
		</script>
	
</body> 


</html> 

