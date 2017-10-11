package controllers

import javax.inject._
import play.api._
import play.api.mvc._

class WelcomeController @Inject() extends Controller {

  def welcome = Action { implicit request =>
    Ok(views.html.index())
  }
}
