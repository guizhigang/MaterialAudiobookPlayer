package de.ph1b.audiobook.persistence.internals.migrations

import android.database.sqlite.SQLiteDatabase

/**
 * In 41 the loudness column was introduced.
 *
 * @author Paul Woitaschek
 */
class Migration40to41 : Migration {

  override fun migrate(db: SQLiteDatabase) {
    db.execSQL("ALTER TABLE tableBooks ADD loudnessGain INTEGER")
  }
}
