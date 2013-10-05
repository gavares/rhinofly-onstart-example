package rlb

import play.api.GlobalSettings
import com.typesafe.scalalogging.slf4j.Logging

/**
 * Date: 10/5/13
 * Time: 12:09 PM
 */
object Global extends GlobalSettings with Logging {

  override def onStart(app: play.api.Application): Unit = {
    logger.info("Global onStart running")
  }

}
