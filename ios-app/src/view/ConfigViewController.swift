/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

import Foundation
import UIKit
import MultiplatformLibrary

class ConfigViewController: UIViewController {
    @IBOutlet var testView: UITextField!
        
    override func viewDidLoad() {
        super.viewDidLoad()
        
        val result = TestModule().testMe()
        testView.text = "Is Deal Available: \(result)"
    }
}

