// Generated by view binder compiler. Do not edit!
package br.arc_campos.gastoviagens.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.arc_campos.gastoviagens.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCalc;

  @NonNull
  public final EditText editAutonomia;

  @NonNull
  public final EditText editDistance;

  @NonNull
  public final EditText editPreco;

  @NonNull
  public final TextView texTotalValue;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button btnCalc,
      @NonNull EditText editAutonomia, @NonNull EditText editDistance, @NonNull EditText editPreco,
      @NonNull TextView texTotalValue) {
    this.rootView = rootView;
    this.btnCalc = btnCalc;
    this.editAutonomia = editAutonomia;
    this.editDistance = editDistance;
    this.editPreco = editPreco;
    this.texTotalValue = texTotalValue;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_calc;
      Button btnCalc = ViewBindings.findChildViewById(rootView, id);
      if (btnCalc == null) {
        break missingId;
      }

      id = R.id.edit_autonomia;
      EditText editAutonomia = ViewBindings.findChildViewById(rootView, id);
      if (editAutonomia == null) {
        break missingId;
      }

      id = R.id.edit_distance;
      EditText editDistance = ViewBindings.findChildViewById(rootView, id);
      if (editDistance == null) {
        break missingId;
      }

      id = R.id.edit_preco;
      EditText editPreco = ViewBindings.findChildViewById(rootView, id);
      if (editPreco == null) {
        break missingId;
      }

      id = R.id.tex_total_value;
      TextView texTotalValue = ViewBindings.findChildViewById(rootView, id);
      if (texTotalValue == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, btnCalc, editAutonomia, editDistance,
          editPreco, texTotalValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}