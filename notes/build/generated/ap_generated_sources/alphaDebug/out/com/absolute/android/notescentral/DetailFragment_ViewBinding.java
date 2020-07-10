// Generated code from Butter Knife. Do not modify!
package com.absolute.android.notescentral;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.absolute.android.notescentral.models.views.ExpandableHeightGridView;
import com.neopixl.pixlui.components.edittext.EditText;
import com.neopixl.pixlui.components.textview.TextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailFragment_ViewBinding implements Unbinder {
  private DetailFragment target;

  @UiThread
  public DetailFragment_ViewBinding(DetailFragment target, View source) {
    this.target = target;

    target.root = Utils.findRequiredViewAsType(source, R.id.detail_root, "field 'root'", ViewGroup.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.detail_title, "field 'title'", EditText.class);
    target.content = Utils.findRequiredViewAsType(source, R.id.detail_content, "field 'content'", EditText.class);
    target.attachmentsAbove = Utils.findRequiredViewAsType(source, R.id.detail_attachments_above, "field 'attachmentsAbove'", ViewStub.class);
    target.attachmentsBelow = Utils.findRequiredViewAsType(source, R.id.detail_attachments_below, "field 'attachmentsBelow'", ViewStub.class);
    target.mGridView = Utils.findOptionalViewAsType(source, R.id.gridview, "field 'mGridView'", ExpandableHeightGridView.class);
    target.locationTextView = Utils.findRequiredViewAsType(source, R.id.location, "field 'locationTextView'", TextView.class);
    target.timestampsView = Utils.findRequiredView(source, R.id.detail_timestamps, "field 'timestampsView'");
    target.reminderLayout = Utils.findRequiredViewAsType(source, R.id.reminder_layout, "field 'reminderLayout'", LinearLayout.class);
    target.reminderIcon = Utils.findRequiredViewAsType(source, R.id.reminder_icon, "field 'reminderIcon'", ImageView.class);
    target.datetime = Utils.findRequiredViewAsType(source, R.id.datetime, "field 'datetime'", TextView.class);
    target.titleCardView = Utils.findRequiredView(source, R.id.detail_tile_card, "field 'titleCardView'");
    target.scrollView = Utils.findRequiredViewAsType(source, R.id.content_wrapper, "field 'scrollView'", ScrollView.class);
    target.creationTextView = Utils.findRequiredViewAsType(source, R.id.creation, "field 'creationTextView'", TextView.class);
    target.lastModificationTextView = Utils.findRequiredViewAsType(source, R.id.last_modification, "field 'lastModificationTextView'", TextView.class);
    target.titleWrapperView = Utils.findRequiredView(source, R.id.title_wrapper, "field 'titleWrapperView'");
    target.tagMarkerView = Utils.findRequiredView(source, R.id.tag_marker, "field 'tagMarkerView'");
    target.detailWrapperView = Utils.findRequiredViewAsType(source, R.id.detail_wrapper, "field 'detailWrapperView'", ViewManager.class);
    target.snackBarPlaceholder = Utils.findRequiredView(source, R.id.snackbar_placeholder, "field 'snackBarPlaceholder'");
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.root = null;
    target.title = null;
    target.content = null;
    target.attachmentsAbove = null;
    target.attachmentsBelow = null;
    target.mGridView = null;
    target.locationTextView = null;
    target.timestampsView = null;
    target.reminderLayout = null;
    target.reminderIcon = null;
    target.datetime = null;
    target.titleCardView = null;
    target.scrollView = null;
    target.creationTextView = null;
    target.lastModificationTextView = null;
    target.titleWrapperView = null;
    target.tagMarkerView = null;
    target.detailWrapperView = null;
    target.snackBarPlaceholder = null;
  }
}
