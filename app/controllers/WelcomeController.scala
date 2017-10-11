package controllers

import play.api.mvc._

class WelcomeController extends Controller {

  def welcome = Action {
    Ok(views.html.welcome())
  }
}
