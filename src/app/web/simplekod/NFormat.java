package app.web.simplekod.nformat;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import java.math.RoundingMode;
import java.text.NumberFormat;

@DesignerComponent(
  version = 1,
  description = "Format numbers based on default system language and country by <b> Edmilson Torres </b>",
  category = ComponentCategory.EXTENSION,
  nonVisible = true,
  iconName = "images/extension.png",
  helpUrl = "https://github.com/eddiert/NFormatAIX"
)
@SimpleObject(external = true)
public class NFormat extends AndroidNonvisibleComponent {

  public NFormat(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(
    description = "Format numbers based on default system language and country. Value is double (max 15 digit numbers). Decimal is int."
  )
  public String Format(double value, int decimal) {
    NumberFormat nFormat = NumberFormat.getNumberInstance();
    nFormat.setRoundingMode(RoundingMode.DOWN);
    nFormat.setMaximumFractionDigits(decimal);
    nFormat.setMinimumFractionDigits(decimal);
    String result = nFormat.format(value);
    return result;
  }
}
