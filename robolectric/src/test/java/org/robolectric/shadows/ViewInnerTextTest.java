package org.robolectric.shadows;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ViewInnerTextTest {
  private Context context;

  @Before
  public void setUp() throws Exception {
    context = ApplicationProvider.getApplicationContext();
  }

  @Test
  public void testInnerText() {
    LinearLayout top = new LinearLayout(context);
    top.addView(textView("blah"));
    top.addView(new View(context));
    top.addView(textView("a b c"));

    LinearLayout innerLayout = new LinearLayout(context);
    top.addView(innerLayout);

    innerLayout.addView(textView("d e f"));
    innerLayout.addView(textView("g h i"));
    innerLayout.addView(textView(""));
    innerLayout.addView(textView(null));
    innerLayout.addView(textView("jkl!"));

    top.addView(textView("mnop"));

    assertEquals("blah a b c d e f g h i jkl! mnop", shadowOf(top).innerText());
  }

  @Test
  public void shouldOnlyIncludeViewTextViewsText() {
    LinearLayout top = new LinearLayout(context);
    top.addView(textView("blah", View.VISIBLE));
    top.addView(textView("blarg", View.GONE));
    top.addView(textView("arrg", View.INVISIBLE));

    assertEquals("blah", shadowOf(top).innerText());
  }

  @Test
  public void shouldNotPrefixBogusSpaces() {
    LinearLayout top = new LinearLayout(context);
    top.addView(textView("blarg", View.GONE));
    top.addView(textView("arrg", View.INVISIBLE));
    top.addView(textView("blah", View.VISIBLE));

    assertEquals("blah", shadowOf(top).innerText());
  }

  private TextView textView(String text) {
    return textView(text, View.VISIBLE);
  }

  private TextView textView(String text, int visibility) {
    TextView textView = new TextView(context);
    textView.setText(text);
    textView.setVisibility(visibility);
    return textView;
  }
}
