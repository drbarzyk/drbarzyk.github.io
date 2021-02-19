<div class="card prop-card mb-4">
	<div class="card-img-bg text-center" style="background-color: #FFC72C">
		<img class="card-img-top player-headshot" src="https://cdn.nba.com/headshots/nba/latest/1040x760/201939.png" alt="Steph">
	</div>
	<div class="card-body pb-0 mb-2">
		<div class="row">
			<h5 class="card-title"><%= request.getParameter("playerName") %></h5>
			<h6 class="card-subtitle mb-2 text-muted">Warriors #30</h6>
		</div>
		<div class="row">
			<span class="col-auto me-auto card-text">Points</span> <span
				class="col-auto card-text">25+</span>
		</div>
	</div>
	<div class="progress-bar-container">
		<div class="progress-bar" style="width: <%= (17.0/25.0) * 100 %>%">
			<span><%= 17 %> / <%= 25 %></span>
		</div>
	</div>
</div>