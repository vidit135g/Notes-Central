// Generated code from Butter Knife. Do not modify!
package com.absolute.android.notescentral;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NoteInfosActivity_ViewBinding implements Unbinder {
  private NoteInfosActivity target;

  @UiThread
  public NoteInfosActivity_ViewBinding(NoteInfosActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NoteInfosActivity_ViewBinding(NoteInfosActivity target, View source) {
    this.target = target;

    target.category = Utils.findRequiredViewAsType(source, R.id.note_infos_category, "field 'category'", TextView.class);
    target.tags = Utils.findRequiredViewAsType(source, R.id.note_infos_tags, "field 'tags'", TextView.class);
    target.chars = Utils.findRequiredViewAsType(source, R.id.note_infos_chars, "field 'chars'", TextView.class);
    target.words = Utils.findRequiredViewAsType(source, R.id.note_infos_words, "field 'words'", TextView.class);
    target.checklistItems = Utils.findRequiredViewAsType(source, R.id.note_infos_checklist_items, "field 'checklistItems'", TextView.class);
    target.checklistCompletedItems = Utils.findRequiredViewAsType(source, R.id.note_infos_completed_checklist_items, "field 'checklistCompletedItems'", TextView.class);
    target.images = Utils.findRequiredViewAsType(source, R.id.note_infos_images, "field 'images'", TextView.class);
    target.videos = Utils.findRequiredViewAsType(source, R.id.note_infos_videos, "field 'videos'", TextView.class);
    target.audioRecordings = Utils.findRequiredViewAsType(source, R.id.note_infos_audiorecordings, "field 'audioRecordings'", TextView.class);
    target.sketches = Utils.findRequiredViewAsType(source, R.id.note_infos_sketches, "field 'sketches'", TextView.class);
    target.files = Utils.findRequiredViewAsType(source, R.id.note_infos_files, "field 'files'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NoteInfosActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.category = null;
    target.tags = null;
    target.chars = null;
    target.words = null;
    target.checklistItems = null;
    target.checklistCompletedItems = null;
    target.images = null;
    target.videos = null;
    target.audioRecordings = null;
    target.sketches = null;
    target.files = null;
  }
}
